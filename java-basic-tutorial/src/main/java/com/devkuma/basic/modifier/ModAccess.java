package com.devkuma.basic.modifier;

public class ModAccess {
    public String pubVar = "public";
    protected String protVar = "protected";
    String packVar = "package private";
    private String priVar = "private";

    public void test() {
        // 클래스 내부에서는 모든 레벨의 맴버로 접근 가능하다.
        System.out.println(this.pubVar);
        System.out.println(this.protVar);
        System.out.println(this.packVar);
        System.out.println(this.priVar);
    }

    public static void main(String[] args) {
        ModAccess m = new ModAccess();
        m.test();
    }
}
