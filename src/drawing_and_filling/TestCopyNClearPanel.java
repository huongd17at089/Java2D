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
public class TestCopyNClearPanel extends JPanel{
    
          @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            // ve hinh
            g2d.drawArc(10, 20, 150, 50, -25, -130);
            // copy sang phai
           g2d.copyArea(0, 0, 200, 100, 200, 0);
           // xoa hinh ben trai
           g2d.clearRect(0, 0, 170, 100);
        } 
    
}
