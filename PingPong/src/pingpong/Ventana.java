/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame{
    
    Bola miBola;
    
    public Ventana(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        miBola=new Bola(10, 10);
        
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        miBola.paint(g2d);
    }
}
