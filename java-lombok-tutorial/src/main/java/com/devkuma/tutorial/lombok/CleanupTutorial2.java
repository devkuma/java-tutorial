package com.devkuma.tutorial.lombok;

import lombok.Cleanup;

public class CleanupTutorial2 {
    public static void main(String[] args) {
        @Cleanup("dispose") CleanupTutorial2 cleanupTutorial = new CleanupTutorial2();
    }

    public void close() {
        System.out.println("close 메소드가 호출되었습니다.");
    }

    public void dispose() {
        System.out.println("dispose 메소드가 호출되었습니다.");
    }
}