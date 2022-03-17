package com.devkuma.designpattern.abstractfactory;

import com.devkuma.designpattern.abstractfactory.factory.Factory;
import com.devkuma.designpattern.abstractfactory.factory.Link;
import com.devkuma.designpattern.abstractfactory.factory.Page;
import com.devkuma.designpattern.abstractfactory.factory.Tray;

public class Main {
    public static void main(String[] args) {

        Factory factory = Factory.getFactory("com.devkuma.designpattern.abstractfactory.listfactory.ListFactory");

        Link devkuma = factory.createLink("Devkuma", "https://www.devkuma.com//");
        Link araikuma = factory.createLink("araikuma", "https://araikuma.tistory.com/");

        Link naver = factory.createLink("Naver", "https://www.naver.com/");
        Link daum = factory.createLink("Daum", "https://www.daum.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray pgTray = factory.createTray("프로그래밍");
        pgTray.add(devkuma);
        pgTray.add(araikuma);

        Tray searchTray = factory.createTray("검색사이트");
        searchTray.add(naver);
        searchTray.add(daum);
        searchTray.add(google);

        Page page = factory.createPage("즐겨찾기");
        page.add(pgTray);
        page.add(searchTray);
        page.output();
    }
}