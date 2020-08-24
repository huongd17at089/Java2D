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
public class DrawArcPanel extends JPanel{
        @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawArc(10, 20, 150, 50, -25, -130);
           
        }     
    
}