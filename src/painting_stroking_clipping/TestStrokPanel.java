/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painting_stroking_clipping;


import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
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
public class TestStrokPanel extends JPanel{
    
        private BufferedImage tim ;
       
        public TestStrokPanel() {
            innit();
        }

        private void innit(){
            this.setBackground(Color.WHITE);
            this.setSize(500, 500);
            try {

               tim = ImageIO.read( new File("res/tim.jpg"));
               
            } catch (IOException ex) {
                Logger.getLogger(TestStrokPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void paintComponent( Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            Rectangle2D r = new Rectangle2D.Double(50, 50, 200, 200);
            Stroke stroke = new BasicStroke(20,
                                BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
                                new float[] { 30, 30 }, 0);
            g2d.setStroke(stroke);
            Shape strokedOutline = stroke.createStrokedShape(r);
            g2d.setPaint(new TexturePaint(tim, 
                new Rectangle2D.Double(0, 0, tim.getWidth(), tim.getHeight())));
            g2d.fill(strokedOutline); 
            //g2d.draw(r);       
        }
    
}
