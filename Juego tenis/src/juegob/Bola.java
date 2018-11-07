/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegob;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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
    
     /*public Bola(Juego m, int xe, int ye/*, int dxe, int dye*//*){
     
         x=xe;
         y=ye;
         /*dx=dxe;
         dy=dye;*/
     //}
    
    public void mover(){
        
        
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
        x=x+dx;
        y=y+dy;
    }
    
    public void paint(Graphics g){
        
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.BLACK);
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    /*public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }*/
    
    
}
