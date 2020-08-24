/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painting_stroking_clipping;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class TestPaintPanel extends JPanel{
    
        private BufferedImage emoji ;
       
        public TestPaintPanel() {
            innit();
        }

        private void innit(){
            this.setBackground(Color.WHITE);
            this.setSize(500, 500);
            try {

               emoji = ImageIO.read( new File("res/emoji.jpg"));
               
            } catch (IOException ex) {
                Logger.getLogger(TestPaintPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void paintComponent( Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            
        //Solid Colors 
            g2d.setColor(Color.red);
            g2d.fillRect(10, 10, 100, 100);
        //GradientPaint
            g2d.setPaint(new GradientPaint(130, 10, Color.red, 200, 10, Color.pink));
            g2d.fillRect(130, 10, 100, 100);
        //  TexturePaint  
            g2d.setPaint(new TexturePaint(emoji, new Rectangle2D.Double(0, 0, emoji.getWidth(), emoji.getHeight())));
            g2d.fillRect(250, 10, emoji.getWidth()*2, emoji.getHeight()*2);
                
        }
    
}

