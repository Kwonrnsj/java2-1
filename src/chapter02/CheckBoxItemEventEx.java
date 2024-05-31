package chapter02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame{
   private JCheckBox [] fruits = new JCheckBox [3];
   private String [] names = {"사괴", "배", "체리"};
   private JLabel sumLabel;

   public CheckBoxItemEventEx() {
    setTitle("체크박스와 ItemEvent 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(new JLabel("사과 100원, 배500원 체리 20000원"));
    MyItemListener listener = new MyItemListener();
    for(int i=0; i<fruits.length; i++) {
        fruits[i] = new JCheckBox(names[i]);
        fruits[i].setBorderPainted(true);
        c.add(fruits[i]);
    }
   }

}
