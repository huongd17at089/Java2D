package DemoFrame;


import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DinhGi
 */


public class Frame extends JFrame {
    public Frame(JComponent p ) throws HeadlessException {
        initUI();
        add(p);
    }
 
    private void initUI() {
        setTitle("Example");
        this.setSize(550, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.WHITE); 
        this.setLayout(new BorderLayout());
    }
}
