package com.devkuma.designpattern.template;

public abstract class AbstractMonster {

    public String name;

    public abstract int getAttack();

    public abstract int getDefense();

    public final void showInfo() {
        System.out.print("이름 : ");
        System.out.println(name);
        System.out.print("공격력 : ");
        System.out.println(getAttack());
        System.out.print("수비력 : ");
        System.out.println(getDefense());
        System.out.println();
    }
}
