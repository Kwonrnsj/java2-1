package chapter02;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
    public paintJPanelEx() {
    setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(250, 200);
        setVisible(true);
    }
}

    // JPanel을 상속받는 새 패널 구현
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // 이것이 제일 먼저 호출되야 함. 이전에 그려진 것들을 모두 지우는 역할
            g.setColor(Color.BLUE);
            g.drawRect(10, 10, 50, 50);
            g.drawString("자바가 정말 재밌다.~~", 30, 30);
            g.setColor(new Color(250, 0 , 0));
            g.setFont(new Font("Arial", Font.ITALIC, 30));
            g.setColor(new Color(0x00ff00ff));
            g.drawLine(20, 20, 100, 100);
            g.drawOval(20, 300, 80, 180);
            g.drawRoundRect(20, 20, 120, 80, 40, 60);
            g.drawArc(20, 200, 80, 80, 90, 270);
            // 다각형 그리기, xy좌표 배열이 필요함
            int []x = {80,40,80,120, 90};
            int []y = {40,120,200,120, 100};
            g.fillPolygon(x, y, 5);
            // 이미지 호출
            g.drawImage(img, 20, 20, this);
            // 이미지 패널 전체 채우기
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

