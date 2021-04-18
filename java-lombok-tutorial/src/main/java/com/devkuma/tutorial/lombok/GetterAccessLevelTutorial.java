package com.devkuma.tutorial.lombok;

import lombok.AccessLevel;
import lombok.Getter;

public class GetterAccessLevelTutorial {
    @Getter(AccessLevel.PRIVATE)
    private String value;
}
