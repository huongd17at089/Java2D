/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

/**
 *
 * @author My PC
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author My PC
 */
public class Panel2 extends JPanel{
    
    private Image im ;
    public Panel2() {
   
        this.setBackground(Color.WHITE);
//        try {
//            //im = ImageIO.read(getClass().getResourceAsStream("/meo.jpg"));
//           im = ImageIO.read( new File("res/meo.jpg"));
//        } catch (IOException ex) {
//            Logger.getLogger(Panel2.class.getName()).log(Level.SEVERE, null, ex);
//        }
    im = new ImageIcon("res/meo.jpg").getImage();
    //    im = this.getToolkit().getImage("res/meo.jpg");
    }
    
    @Override
    public void paintComponent( Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // g2d.rotate(Math.PI, 200, 200);
        // vẽ hình mèo 
        g2d.drawImage(im, 10, 10, 100, 100, this);
//        g2d.setColor(Color.blue);
//        g2d.drawRect(300, 300, 50, 50);
    }
    
    
}
