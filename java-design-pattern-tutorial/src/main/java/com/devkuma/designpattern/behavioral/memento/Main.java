package com.devkuma.designpattern.behavioral.memento;

import com.devkuma.designpattern.behavioral.memento.game.Gamer;
import com.devkuma.designpattern.behavioral.memento.game.Memento;

public class Main {

    public static void main(String[] args) {
        // 첫 소지금은 100이다.
        Gamer gamer = new Gamer(100);
        // 첫번째 상태를 저장한다.
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 10; i++) {
            System.out.println("==== " + i);
            System.out.println("현재 상태:" + gamer);

            // 게임을 진행한다.
            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （많이 증가했으므로 현재 상태를 저장하자)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （많이 줄어들었으므로 이전 상태로 복원하자）");
                gamer.restoreMemento(memento);
            }
        }
    }
}