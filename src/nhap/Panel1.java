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
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author My PC
 */
public class Panel1 extends JPanel{

    public Panel1() {
       innit();
    }
    
    private void innit(){
         this.setBackground(Color.WHITE);
    }
     
    
    @Override
    public void paintComponent( Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        // chữ nhật rỗng viền màu xanh
        g2d.setColor(Color.BLUE);
        g2d.drawRect(25, 25, 100, 30);
        // chữ nhật màu tự dặt
        g2d.setColor(new Color(190,81, 215));
        g2d.fillRect(25, 65, 100, 30);
        // chào thế giới màu đỏ
        g2d.setColor(Color.red);
        Font f = new Font( "TimesRoman", Font.BOLD, 24);
        g2d.setFont(f);
        g2d.drawString("hello world!!!", this.getWidth()/3, this.getHeight()/3);
        
    }
    
   

}
