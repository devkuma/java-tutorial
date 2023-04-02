package com.devkuma.basic.thread;

public class ThreadWait extends Thread {
    // 해당 쓰레드가 실행되면 자기 자신의 모니터링 락을 획득
    // 5번 반복하면서 0.5초씩 쉬면서 total에 값을 누적
    // 그후에 notify()메소드를 호출하여 wiat하고 있는 쓰레드를 깨운다.
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다.");
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }

    public static void main(String[] args) {
        // 쓰레드 A를 생성후에 start한다.
        // 해당 쓰레드가 실행되면, 해당 쓰레드는 run 메소드 안에서 자신의 모니터링 락을 획득
        ThreadWait a = new ThreadWait();
        a.start();

        // b에 대하여 동기화 블럭을 설정
        // 만약 main 쓰레드가 아래의 블록을 위의 Thread보다 먼저 실행되었다면 wait를 하게 되면서 모니터링 락을 놓고 대기
        synchronized (a) {
            try {
                // b.wait()메소드를 호출.
                // 메인쓰레드는 정지
                // ThreadA가 5번 값을 더한 후 notify를 호출하게 되면 wait에서 깨어남
                System.out.println("b가 완료될때까지 기다립니다.");
                a.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 깨어난 후 결과를 출력
            System.out.println("Total is: " + a.total);
        }
    }
}
