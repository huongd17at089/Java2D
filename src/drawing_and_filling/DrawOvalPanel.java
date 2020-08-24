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
public class DrawOvalPanel extends JPanel{
    
        @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawOval(20, 20, 60, 60);
            g2d.fillOval(120, 20, 100, 60);
        } 
    
}
