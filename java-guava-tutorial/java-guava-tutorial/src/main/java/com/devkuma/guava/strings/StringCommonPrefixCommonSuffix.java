package com.devkuma.guava.strings;

import com.google.common.base.Strings;

public class StringCommonPrefixCommonSuffix {

    public static void main(String[] args) {
        // commonPrefix
        System.out.println(Strings.commonPrefix("abc12345", "abcABCDE"));
        System.out.println(Strings.commonPrefix("setHoge", "setMoge"));

        // commonSuffix
        System.out.println(Strings.commonSuffix("12345abc", "ABCabc"));
        System.out.println(Strings.commonSuffix("removable", "usable"));
    }
}
