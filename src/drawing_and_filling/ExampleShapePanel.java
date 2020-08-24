/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing_and_filling;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class ExampleShapePanel extends JPanel{
    
            @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            // cach 1 
           int [] X = { 39 ,94 ,97 ,142 ,53 ,58 ,26 };
           int [] Y = { 33 ,74 ,36 ,70 ,108 ,80 ,106 };
           int pts = X.length;
           g2d.drawPolygon(X, Y, pts);
           g2d.drawString("Cach 1", 40, 130);
           // cach 2
           Polygon poly = new Polygon();
           for( int i = 0 ; i < pts; i++)
               poly.addPoint(X[i] + 200, Y[i]);
           g2d.draw(poly);
           g2d.drawString("Cach 2", 240, 130);
        } 
    
}

