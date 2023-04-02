package com.devkuma.basic.modifier.other;

import com.devkuma.basic.modifier.ModAccess;

// ModAccess와 상속 관계가 없는 다른 패키지 클래스
public class ModAccessOther {
    public static void main(String[] args) {
        ModAccess my = new ModAccess();
        System.out.println(my.pubVar);
        // protected 이하의 맴버는 접근 불가능하다.
        // System.out.println(my.protVar);
        // System.out.println(my.packVar);
        // System.out.println(my.priVar);
    }
}