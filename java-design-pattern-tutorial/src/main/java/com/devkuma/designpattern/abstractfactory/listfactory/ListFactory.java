package com.devkuma.designpattern.abstractfactory.listfactory;

import com.devkuma.designpattern.abstractfactory.factory.Factory;
import com.devkuma.designpattern.abstractfactory.factory.Link;
import com.devkuma.designpattern.abstractfactory.factory.Page;
import com.devkuma.designpattern.abstractfactory.factory.Tray;

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