package com.devkuma.junit5.assertion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertjTest {

    @Test
    void numberTest() throws Exception {
        assertThat(10) // 주어진 10 숫자는
                .isZero() // 0이고,
                .isNotZero() // 0이 아니고,
                .isPositive() // 양수 이고,
                .isEqualTo(8); // 8과 일치한다.
    }

    @Test
    void stringTest() {
        assertThat("Hello, world! Nice to meet you.") // 주어진 "Hello, world! Nice to meet you." 문자열은
                .isNotEmpty() // 비어있지 않고
                .contains("Nice") // "Nice"를 포함하고
                .contains("world") // "world"도 포함하고
                .doesNotContain("ZZZ") // "ZZZ"는 포함하지 않으며
                .startsWith("Hell") // "Hell"로 시작하고
                .endsWith("u.") // "u."로 끝나며
                .isEqualTo("Hello, world! Nice to meet you."); // "Hello, world! Nice to meet you."과 일치한다.
    }

}
