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
public class DrawStringPanel extends JPanel{
    
    @Override
    public void paint( Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Font f = new Font("TimesRoman", Font.PLAIN, 72);
        g2d.setFont(f);
        g2d.drawString("Hello world!!!", 10, 100);
//       char[] hello = {'h', 'e', 'l' , 'l' , 'o' , ' ' , 'w' , 'o', 'r', 'l', 'd', '!'};
//       g2d.drawChars(hello, 0, 12, 10, 200);
    }
    
}
