/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw_String;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DinhGi
 */
public class TestFontPanel extends JPanel{
    
    @Override
        public void paint( Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            Font f1 = new Font("TimesRoman", Font.PLAIN, 18);
            Font f2 = new Font("TimesRoman", Font.BOLD, 18);
            Font f3 = new Font("TimesRoman", Font.ITALIC, 18);
            Font f4 = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 18);
            g2d.setFont(f1);
            g2d.drawString("Chu in thuong", 10, 25);
            g2d.setFont(f2);
            g2d.drawString("Chu in dam", 10, 50);
            g2d.setFont(f3);
            g2d.drawString("Chu in nghieng ", 10, 75);
            g2d.setFont(f4);
            g2d.drawString("Chu in dam va nghieng", 10, 100);
        }
}
