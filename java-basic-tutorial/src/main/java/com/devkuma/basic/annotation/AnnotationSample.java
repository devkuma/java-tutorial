package com.devkuma.basic.annotation;

import java.lang.reflect.Method;

public class AnnotationSample {
    @Version(1.0)
    public void annotationTest() {
        System.out.println("Released");
    }

    public static void main(String[] args) {
        try {
            // annotationTest 메서드를 받아온다.
            Method method = AnnotationSample.class.getMethod("annotationTest");
            // Version 어노테이션을 받아온다.
            Version version = method.getAnnotation(Version.class);
            // Version 어노테이션이 1.0이상인 경우에 실행한다.
            if (version.value() >= 1.0) {
                method.invoke(AnnotationSample.class.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}