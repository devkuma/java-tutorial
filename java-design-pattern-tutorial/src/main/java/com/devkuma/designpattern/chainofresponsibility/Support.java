package com.devkuma.designpattern.chainofresponsibility;

public abstract class Support {

    // 이 트러블 해결자의 이름
    private String name;
    // 다음 차례로 넘기는 곳
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 문제 해결 절차
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    // 해결 방법
    protected abstract boolean resolve(Trouble trouble);

    // 해결
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 미해결
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}