package com.devkuma.designpattern.creational.abstractfactory.factory;

public abstract class Factory {

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title);

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("클래스 " + classname + "를 찾을 수 없습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
}