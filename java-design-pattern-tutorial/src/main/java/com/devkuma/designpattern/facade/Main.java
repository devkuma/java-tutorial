package com.devkuma.designpattern.facade;

import com.devkuma.designpattern.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("devkuma@devkuma.com", "welcome.html");
    }
}