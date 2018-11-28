/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegob;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas/* implements KeyListener*/{
    
    Bola miBola=new Bola(this/*, this.getWidth()-30, this.getHeight()-30*/);
    Raqueta raqueta=new Raqueta(this);
    
    public Juego(){
        
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                raqueta.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                raqueta.keyReleased(e);
            }
        
        });
    }
    public void mover(){
        
        raqueta.moverRaqueta();
        miBola.mover();
    }
    
    @Override
    public void update(Graphics g){
        
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        raqueta.pintarRaqueta(g2d);
        miBola.paint(g2d);
    }

    @Override
    public void paint(Graphics g){
        //public final void addSuppressed(StackOverflowError);
        update(g);
    }
    
    public Bola getMiBola() {
        return miBola;
    }

    /*@Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        raqueta.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        raqueta.keyReleased(e);
    }*/
}
