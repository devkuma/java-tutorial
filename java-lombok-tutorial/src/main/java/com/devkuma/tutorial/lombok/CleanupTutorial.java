package com.devkuma.tutorial.lombok;

import lombok.Cleanup;

public class CleanupTutorial {
    public static void main(String[] args) {
        @Cleanup CleanupTutorial cleanupTutorial = new CleanupTutorial();
    }

    public void close() {
        System.out.println("close 메소드가 호출되었습니다.");
    }

    public void close(String arg) {
        System.out.println("close(String) 메소드가 호출되었습니다.");
    }
}
