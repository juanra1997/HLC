/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Juanra
 */
public class Raquetas {
    
    int x=115, y=20, dx=0, w=60, h=15;
    Juego miJuego;
    
    public Raquetas(Juego m){
        
        miJuego=m;
    }
    
    public void moverRaqueta(){
        
        if(x+dx>0&&x+dx<miJuego.getWidth()-60){
            x=x+dx;
        }
    }
    
    public void pintarRaqueta(Graphics2D g2d){
        
        g2d.setColor(Color.BLACK);
        g2d.fill3DRect(x, y, w, h, true);
    }
    
    public void keyPressed(KeyEvent e){
        
        if(e.getKeyCode()==KeyEvent.VK_A){
            dx=-5;
        }
        if(e.getKeyCode()==KeyEvent.VK_D){
            dx=5;
        }
    }
     public void keyReleased(KeyEvent e){
         dx=0;
     }
     //--------------------------------------------------------
     public Rectangle devolverRaqueta(){
         return new Rectangle(x, y, w, h);
     }
}
