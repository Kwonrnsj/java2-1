package chapter02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonEx extends JFrame{
   public RadioButtonEx() {
    setTitle("라디오버튼 만듥기 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    ButtonGroup g = new ButtonGroup();

    imageIcoe img = new ImageIcon("");
    
    JRadioButton apple = new JRadioButton("사과");
    JRadioButton pear = new JRadioButton("사과");
    JRadioButton  = new JRadioButton("사과");
   }

}
