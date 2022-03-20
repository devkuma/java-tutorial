package com.devkuma.designpattern.creational.abstractfactory.listfactory;

import com.devkuma.designpattern.creational.abstractfactory.factory.Factory;
import com.devkuma.designpattern.creational.abstractfactory.factory.Link;
import com.devkuma.designpattern.creational.abstractfactory.factory.Page;
import com.devkuma.designpattern.creational.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title) {
        return new ListPage(title);
    }
}