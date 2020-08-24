/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDrawArea;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class MyPanel extends JPanel {
    private String kieu;
    private Shape tron = new Ellipse2D.Double(40, 20, 80, 80);
    private Shape vuong = new Rectangle2D.Double(60, 40, 80, 80);
    

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g; 
        if( kieu.equals("out line")){
            g2d.draw(tron);
            g2d.draw(vuong);
            return;
        }
        
        Area hinh1 = new Area(tron);
        Area hinh2 = new Area(vuong);
        
        if(kieu.equals("add")) hinh1.add(hinh2);
        else if(kieu.equals("intersect")) hinh1.intersect(hinh2);
        else if(kieu.equals("subtract")) hinh1.subtract(hinh2);
        if (kieu.equals("exclusive or")) hinh1.exclusiveOr(hinh2);
        
        g2d.setColor(Color.blue);
        g2d.fill(hinh1);
        
        g2d.setColor(Color.black);
        g2d.draw(hinh1);
        
    }
    
}
