package com.devkuma.junit5.extention;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;
import java.util.Optional;

public class MyParameterResolver implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        Executable executable = parameterContext.getDeclaringExecutable();
        int index = parameterContext.getIndex();
        Parameter parameter = parameterContext.getParameter();
        Optional<Object> target = parameterContext.getTarget();

        System.out.printf(
                "target=%s, executable=%s, index=%d, parameter=%s%n",
                target.orElse("<empty>"),
                executable.getName(),
                index,
                parameter.getName()
        );

        return true;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        Class<?> type = parameterContext.getParameter().getType();
        if (type.equals(String.class)) {
            return "Hello";
        } else if (type.equals(int.class)) {
            return 999;
        } else {
            return 12.34;
        }
    }
}