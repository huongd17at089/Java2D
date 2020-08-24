/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author My PC
 */
public class Panel3 extends JPanel{
    
    private Image[] nekopics = new Image[9];
    private Image currentimg;
    private int x, y;
    
    public void innit(){
        
        String nekosrc[] = { "right1", "right2", "stop", "yawn", "scratch1",
            "scratch2","sleep1", "sleep2","awake" }; 
            
        for( int i = 0; i < nekosrc.length; i++ )
            nekopics[i] = (new ImageIcon("Anh/"+ nekosrc[i]+ ".gif")).getImage();
    }
    
}
