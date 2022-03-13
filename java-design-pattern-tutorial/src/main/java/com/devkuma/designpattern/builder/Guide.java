package com.devkuma.designpattern.builder;

public class Guide {

    private Builder builder;

    public Guide(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("야유회에 대해서");
        builder.makeString("일시");
        builder.makeItems(new String[]{
                "2022/3/14 (월)",
                "11:00~",
        });
        builder.makeString("장소");
        builder.makeItems(new String[]{
                "xxx 캠핌장",
        });
        builder.makeString("준비물");
        builder.makeItems(new String[]{
                "회비",
                "고기",
                "음료수",
        });
        builder.close();
    }
}
