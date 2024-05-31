package chapter02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OptionPaneEx extends JFrame {
    public OptionPaneEx() {
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500, 200);
        c.add(new MyPanel(),    BorderLayout.NORTH);
        setVisible(true);
    }

    class MyPanel extends JFrame {
        private JButton inputBtn = new JButton("Input Name");
        private JTextField tf = new JTextField("10");
        private JButton confirmBtn = new JButton("Confirm");
        private JButton messageBtn = new JButton("Message");

        public MyPanel() {
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);
            
        }
    }
}
