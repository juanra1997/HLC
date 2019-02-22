/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Juanra
 */
public class Raqueta {
    
    Juego miJuego;
    int x, y=160, dy=0;
    
    public Raqueta(int px, Juego j){
        
        x=px;
        miJuego=j;
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x, y, 15, 60);
    }
    
    public void mover(){
        if(y+dy>0&&y+dy<miJuego.getHeight()-60){
            y=y+dy;
        }
    }
    
    public Rectangle devolverRaqueta(){
        return new Rectangle(x, y, 15, 60);
    }
    
}
