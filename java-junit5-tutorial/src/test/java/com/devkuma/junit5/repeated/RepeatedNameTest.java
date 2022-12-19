package com.devkuma.junit5.repeated;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedNameTest {

    @RepeatedTest(
            name = "displayName={displayName}, currentRepetition={currentRepetition}, totalRepetitions={totalRepetitions}",
            value = 3
    )
    void test() {
        System.out.println("test");
    }

}
