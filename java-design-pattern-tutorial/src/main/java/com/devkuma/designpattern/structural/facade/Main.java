package com.devkuma.designpattern.structural.facade;

import com.devkuma.designpattern.structural.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("devkuma@devkuma.com", "welcome.html");
    }
}