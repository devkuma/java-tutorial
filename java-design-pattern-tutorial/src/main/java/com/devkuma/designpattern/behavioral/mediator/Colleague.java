package com.devkuma.designpattern.behavioral.mediator;

public interface Colleague {
    void setMediator(Mediator mediator);
    void setColleagueEnabled(boolean enabled);
}