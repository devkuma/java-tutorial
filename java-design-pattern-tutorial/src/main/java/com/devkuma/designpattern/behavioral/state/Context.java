package com.devkuma.designpattern.behavioral.state;

public interface Context {
    // 시간 설정
    void setClock(int hour);

    // 상태 변화
    void changeState(State state);

    // 보안센터 보안요원 호출
    void callSecurityCenter(String msg);

    // 보안 센터 기록
    void recordLog(String msg);
}