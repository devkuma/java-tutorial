package com.devkuma.designpattern.behavioral.mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        // Mediator에서 활성화/비활성화를 지시함
        setEnabled(enabled);
    }
}