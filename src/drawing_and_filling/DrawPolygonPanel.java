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
public class DrawPolygonPanel extends JPanel{
    
        @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
        
           int [] X = {  0, 75, 100, 125, 200, 150, 160, 100, 40 , 50};
           int [] Y = {  85, 75, 10 , 75, 85, 125, 190, 150, 190, 125};
           int pts = X.length;
           g2d.drawPolygon(X, Y, pts);
           
           int [] XX = new int [10]; // tinh tien hinh sang phai
           for( int i = 0 ; i < 10; i++)
               XX[i] = X[i] + 250;
           g2d.fillPolygon(XX, Y, pts);
        }
    
}
