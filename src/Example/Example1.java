/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class Example1 extends JPanel {


    public void paint(Graphics  g){
        
        Graphics2D g2d =  (Graphics2D) g;
        
        // pacman
        g2d.setColor(Color.pink);
        g2d.fillArc(50, 150, 75, 75, 25, 300);
        g2d.setColor(Color.black);
        g2d.fillOval(90, 160, 10, 10);
        
        //dot
        for( int i = 0 ; i < 5; i++)
            g2d.fillOval(150 + 50*i, 180, 20, 20);
        
        //ghost
        int X[] = {400, 470, 470,460,450,440,430,420,410,400, 400};
        int Y[] = {10 +160, 10+160, 50+160,60+160,50+160,60+160,
                    50+160,60+160,50+160,60+160, 10+160};
        
        g2d.setColor(Color.blue);
        Area than = new Area( new Polygon(X, Y, X.length));
        Area dau = new Area(new Ellipse2D.Double(400, 160-25, 70, 70));
        than.add(dau);
        g2d.fill(than);
        
        g2d.setColor(Color.black);
        g2d.fillOval(415, 160, 10, 10);
        g2d.fillOval(445, 160, 10, 10);
        
        int XX[] = { 460,450,440,430,420,410};
        int YY[] = { 60+140,50+140,60+140,50+140,60+140,50+140};
        
        for( int i = 0 ; i < XX.length-1; i++)
            g2d.drawLine(XX[i], YY[i], XX[i+1], YY[i+1]);
        
   
    }
}
