/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Juanra
 */
public class Bola {
    
    int x=0, y=0, dx=1, dy=1;
    Juego miJuego;
    
    public Bola(Juego m){
        
        miJuego=m;
    }
    
    public void mover(){
        
        x=x+dx;
        y=y+dy;
        if(/*x==265*/x==miJuego.getWidth()-30){
            dx=-1;
        }
        if(/*y==337*/y==miJuego.getHeight()-30){
            dy=-1;
        }
        if(x==0){
            dx=1;
        }
        if(y==0){
            dy=1;
        }
    }
    
    public void paint(Graphics g){
        
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.BLACK);
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }
}
