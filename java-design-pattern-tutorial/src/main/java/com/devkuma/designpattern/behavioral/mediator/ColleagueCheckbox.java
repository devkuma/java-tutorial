package com.devkuma.designpattern.behavioral.mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        // Mediator에서 활성화/비활성화를 지시함
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e) {
        // 상태가 변경되면 Mediator에 알림
        mediator.colleagueChanged();
    }
}