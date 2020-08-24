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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author MeoMeo
 */
public class OvalAnimationPanel  extends JPanel implements ActionListener{
    private static final int CANVAS_WIDTH = 530;
    private static final int CANVAS_HEIGHT = 460;
    private static final int UPDATE_PERIOD = 50;   

    private int x = 100, y = 100;  // top-left (x, y)
    private int size = 250;        // width & height
    private int xSpeed = 3, ySpeed = 5; 
    
    Timer tm = new Timer(UPDATE_PERIOD,this);
    
    @Override
    public void paintComponent(Graphics g) {
            super.paintComponent(g); 
            setBackground(Color.BLACK);
            g.setColor(Color.BLUE);
            g.fillOval(x, y, size, size);  
            tm.start();
        }
    
    public void update() {
        x += xSpeed;
        y += ySpeed;
        if (x > CANVAS_WIDTH - size || x < 0) {
            xSpeed = -xSpeed;
        }
        if (y > CANVAS_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();   // cap nhat vi tri x va y
        repaint();  // ve lai 
    }
    
    
}
