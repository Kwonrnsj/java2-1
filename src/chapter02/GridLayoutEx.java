package chapter02;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
    public GridLayoutEx() {
        setTitle("GridLayoutEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 1x10의 GridLayout 배치관리자

        contentPane.setLayout(new GridLayout(1, 10));

        for(int i=0; i<10; i++) { // 10개의 버튼 부착
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text);
            contentPane.add(button); // 컨텐트에 버튼 부착
        }

        setSize(500, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}

