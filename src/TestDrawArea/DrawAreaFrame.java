/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDrawArea;



import java.awt.BorderLayout;

import java.awt.HeadlessException;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class DrawAreaFrame extends JFrame implements ItemListener{
    private JComboBox chon = new JComboBox();
    private MyPanel p = new MyPanel();
    public DrawAreaFrame(String title) throws HeadlessException {
        super(title);
        innit();
    }
    
    private void innit(){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        chon.addItem("out line");
        chon.addItem("add");
        chon.addItem("intersect");
        chon.addItem("subtract");
        chon.addItem("exclusive or");
        chon.addItemListener(this);  
        add(chon, BorderLayout.SOUTH);
    }

    
    @Override
    public void itemStateChanged(ItemEvent e) {
        p.setKieu(chon.getSelectedItem().toString());
        p.repaint();
    }
    
    
    
    
    
}
