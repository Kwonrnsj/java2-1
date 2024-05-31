package chapter02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxEx extends JFrame{
    public CheckBoxEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon gosling = new ImageIcon("");
        
        // 3개의 체그박스를 생성한다.
        JCheckBox apple = new JCheckBox("사과", true);
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", true);
        JCheckBox foo = new JCheckBox("고슬링", gosling, true);

        c.add(apple);
        c.add(pear);
        c.add(cherry);
        c.add(foo);

        setSize(250, 150);
        setVisible(true);
    }   
    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
