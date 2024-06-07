package chapter02;

import javax.swing.*;
import java.awt.*;

public class VibrationFrame extends JFrame implements Runnable{
    private Thread th;
    public VibrationFrame() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}
