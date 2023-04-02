package com.devkuma.basic.modifier;

// ModAccess의 하위 클래스
public class ModAccessChild extends ModAccess {

    public void test() {
        System.out.println(this.pubVar);
        System.out.println(this.protVar);
        System.out.println(this.packVar);
        // System.out.println(this.priVar); // private 변수는 접근 불가능하다.
    }

    public static void main(String[] args) {
        ModAccess mc = new ModAccessChild();
        mc.test();
    }
}