package com.devkuma.designpattern.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    // 현재 위치한 디렉토리명
    private String currentDir = "";

    // 파일을 방문했을 때 호출
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    // 디렉토리를 방문했을 때 호출
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}