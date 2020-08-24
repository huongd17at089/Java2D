/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author MeoMeo
 */
public class RectangleAnimationPanel extends JPanel implements ActionListener{
    Timer tm = new Timer(5,this);
    int x = 0, velx = 2;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(x, 30, 50, 20);
        
        tm.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent ActE){
        if(x<0||x>550){
            velx = - velx;
        }
        x = x + velx;
        repaint();
    }
}
