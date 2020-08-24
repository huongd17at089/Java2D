/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painting_stroking_clipping;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class TestClipPanel extends JPanel{
   
        private Image meo ;
       
        public TestClipPanel() {
            innit();
        }

        private void innit(){
            this.setBackground(Color.WHITE);
            this.setSize(500, 500);
            meo = this.getToolkit().getImage("res/meo.jpg");
        }
           @Override
        public void paintComponent( Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // trc khi clip
            g2d.drawImage(meo, 20, 100, meo.getWidth(this)/4,
                        meo.getHeight(this)/4,  this);
            //clip
            Ellipse2D e = new Ellipse2D.Float(250, 100, 100, 100);
            g2d.clip(e); 
            g2d.drawImage(meo, 200, 100, meo.getWidth(this)/4,
                        meo.getHeight(this)/4,  this);     

        }
    
}
