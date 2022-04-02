package com.devkuma.basic.reflection.ex1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            // 클래스 가져오기
            Class<?> fooClazz = Class.forName("com.devkuma.basic.reflection.ex1.Foo");
            // 인스턴스 생성
            Object myObj = fooClazz.getDeclaredConstructor().newInstance();

            // 메서드(setStr) 가져오기
            Method setStrMethod = fooClazz.getMethod("setStr", String.class);
            // 메서드(setStr) 실행
            setStrMethod.invoke(myObj, "test");

            // 메서드(getStr) 가져오기
            Method getStrMethod = fooClazz.getMethod("getStr");
            // 메서드(getStr) 실행
            System.out.println(getStrMethod.invoke(myObj));


            // 필드(str) 가져오기
            Field strField = fooClazz.getDeclaredField("str");
            strField.setAccessible(true);
            System.out.println(strField.get(myObj));

            // 필드(str) 변경
            strField.set(myObj, "test2");
            System.out.println(strField.get(myObj));

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}