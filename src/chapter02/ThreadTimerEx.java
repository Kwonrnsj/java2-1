package chapter02;

import javax.swing.*;
import java.awt.*;

public class ThreadTimerEx extends JFrame {
    private JLabel timerLabel; // 타이머 값이 출력되는 레이블
    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n=0;
    }
    
}
