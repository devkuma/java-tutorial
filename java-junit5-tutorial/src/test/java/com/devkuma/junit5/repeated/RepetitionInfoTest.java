package com.devkuma.junit5.repeated;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepetitionInfoTest {
    @BeforeEach
    void before(RepetitionInfo repetitionInfo) {
        printRepetitionInfo("before", repetitionInfo);
    }

    @RepeatedTest(3)
    void test(RepetitionInfo repetitionInfo) {
        printRepetitionInfo("  test", repetitionInfo);
    }

    @AfterEach
    void after(RepetitionInfo repetitionInfo) {
        printRepetitionInfo("after", repetitionInfo);
    }

    private void printRepetitionInfo(String method, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();

        System.out.printf("%s (%d/%d)%n", method, currentRepetition, totalRepetitions);
    }
}
