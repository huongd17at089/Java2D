/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw_image;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class DrawImagePanel extends JPanel{
    
    private Image image ;
    public DrawImagePanel() {
        innit();
    }
    
    private void innit(){
        this.setBackground(Color.WHITE);
        this.setSize(500, 500);
        image = this.getToolkit().getImage("res/meo.jpg");
    }
    
    @Override
    public void paintComponent( Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // vẽ hình mèo 
        int w = image.getWidth(this);
        int h = image.getHeight(this);

        // 25% x, 25%y
            g2d.drawImage(image, 100, 100, w/4, h/4,  this);
        // 50%x, 25%y
            g2d.drawImage(image, 110 + w/4, 100, w/2, h/4 , this);
        
         
    }
}
