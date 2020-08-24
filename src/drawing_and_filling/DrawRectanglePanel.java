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
public class DrawRectanglePanel extends JPanel{
    
                @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
                // chu nhat thuong
            g2d.drawRect(20, 20, 60, 60);
            g2d.fillRect(120, 20, 60, 60);
                // chu nhat bo goc
            // g2d.drawRoundRect(x, y, w, h, aw, ah);
            g2d.drawRoundRect(20, 150, 60, 60, 10, 10);
            g2d.fillRoundRect(120, 150, 60, 60, 20 , 20); 
                // chu nhat 3D do bong
            g2d.setColor(Color.WHITE);
            g2d.draw3DRect(20, 250, 60, 60, true);
            g2d.draw3DRect(120, 250, 60, 60, false);      

        }
    
}
