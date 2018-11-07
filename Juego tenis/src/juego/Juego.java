/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas{
    
    Bola miBola=new Bola(this);
    
    public void mover(){
        
        miBola.mover();
    }
    
    @Override
    public void update(Graphics g){
        
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        miBola.paint(g2d);
    }

    @Override
    public void paint(Graphics g){
        paint(g);
    }
    
    public Bola getMiBola() {
        return miBola;
    }
}
