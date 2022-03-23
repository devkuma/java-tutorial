package com.devkuma.designpattern.behavioral.state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("금고 사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반 통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);

        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 버튼을 누르는 이벤트가 발생하면 여기 메소드가 실행된다.
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            // 금고 사용 버튼
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            // 비상벨 버튼
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            // 일반 통화 버튼
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            // 종료 버튼
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 시간 설정
    public void setClock(int hour) {
        String clockstring = "현재 시간은 ";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    // 상태 변화
    public void changeState(State state) {
        System.out.println(this.state + "에서 " + state + "로 상태가 변경되었습니다.");
        this.state = state;
    }

    // 경비센터 경비원 호출
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 보안 센터 기록
    public void recordLog(String msg) {
        textScreen.append("record... " + msg + "\n");
    }
}