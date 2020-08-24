package animation.image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MeoMeo
 */
public class Animaton extends JComponent {
    static JPanel p;
    static int colums = 3;
    static int row = 195;
    static int number = 1;

    public Animaton(JPanel p) {
        this.p = p;
        setBounds(0, 0, p.getWidth(), p.getHeight());
    }

    public void paint(Graphics g){
        super.paint(g);
        Image image = (new ImageIcon("res/"+number+".png")).getImage() ;
        g.drawImage(image, colums, row, 206, 200, null);
    }
    static Thread thread = new Thread(){
        @Override
        public void run(){
            try{
                while(true){
                    number++;
                    if(number==8){
                        number=1;
                    }
                    p.repaint();
                    colums+=4;
                    Thread.sleep(100);
                }
            }catch(java.lang.InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    };
    public static void move(){
        if(!thread.isAlive()){
            thread.start();
        }
        colums+=3;
    }
    
    
}

