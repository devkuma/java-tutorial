package com.devkuma.designpattern.behavioral.command.drawer;

import com.devkuma.designpattern.behavioral.command.command.Command;

import java.awt.Point;

public class DrawCommand implements Command {

    // 그리기 대상
    protected Drawable drawable;
    // 그리기 위치
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    public void execute() {
        drawable.draw(position.x, position.y);
    }
}