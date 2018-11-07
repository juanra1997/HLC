/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegob;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas{
    
    Bola miBola=new Bola(this/*, this.getWidth()-30, this.getHeight()-30*/);
    
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
        //public final void addSuppressed(StackOverflowError);
        paint(g);
    }
    
    public Bola getMiBola() {
        return miBola;
    }
}
