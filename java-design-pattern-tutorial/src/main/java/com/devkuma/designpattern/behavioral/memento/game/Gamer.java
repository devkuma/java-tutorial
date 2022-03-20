package com.devkuma.designpattern.behavioral.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {

    private int money;
    private ArrayList<String> fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitNames = {
            "사과", "포도", "바나나", "귤",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // 베팅...게임 진행한다.
    public void bet() {
        // 주사위를 던진다.
        int dice = random.nextInt(6) + 1;

        if (dice == 1) {
            // 1인 경우, 소지금 증가한다.
            money += 100;
            System.out.println("소지금이 증가하였습니다.");
        } else if (dice == 2) {
            // 2인 경우, 소지금이 절반이 된다.
            money /= 2;
            System.out.println("소지금이 절반이 되었습니다.");
        } else if (dice == 6) {
            // 6인 경우, 과일을 받는다.
            String fruit = getFruit();
            System.out.println("과일(" + fruit + ")을 받았습니다.");
            fruits.add(fruit);
        } else {
            // 그외인 경우, 아무 일도 일어나지 않는다.
            System.out.println("아무 일도 일어나지 않았다.");
        }
    }

    // 스냅샷 생성: 현재 상황을 저장한 객체를 생성하고 반환한다.
    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = (String) it.next();
            if (fruit.startsWith("맛있는")) {
                // 맛있는 과일만 저장한다.
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    // 실행 취소(Undo)을 실행: 저장했던 객체를 전달받아 이전 상태로 되돌린다.
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "맛있는 ";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }
}