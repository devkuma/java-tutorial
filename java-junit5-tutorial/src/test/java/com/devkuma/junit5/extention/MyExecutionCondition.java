package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyExecutionCondition implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        if (context.getTestMethod().isPresent()) {
            System.out.println("# Test method = " + context.getRequiredTestMethod().getName());
            return context.getDisplayName().contains("o")
                    ? ConditionEvaluationResult.enabled("Test name has 'o'.")
                    : ConditionEvaluationResult.disabled("Test name does not have 'o'.");
        } else {
            System.out.println("# Test class = " + context.getRequiredTestClass().getSimpleName());
            return ConditionEvaluationResult.enabled("This is test class.");
        }
    }
}