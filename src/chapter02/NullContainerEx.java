package chapter02;
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
    public NullContainerEx() {
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null); // 컨텐트팬의 배치관리자 제거

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        contentPane.add(la);



        for(int i=0; i<=9; i++) { // 10개의 버튼 부착
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15, i*15);
            b.setSize(50, 20);
            contentPane.add(b);
        }

        setSize(300, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new NullContainerEx();
    }
}

