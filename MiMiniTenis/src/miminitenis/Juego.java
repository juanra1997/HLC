/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miminitenis;

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
    
    Bola miBola;
    Raqueta raqueta=new Raqueta(this);
    Raquetas raquetas=new Raquetas(this);
    
    
    public Juego(Panel p, Ventana v){
        
        miBola=new Bola(this, p, v);
        
        this.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                raqueta.keyPressed(e);
                raquetas.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                raqueta.keyReleased(e);
                raquetas.keyReleased(e);
            }
        
        });
    }
    public void mover(){
        
        raqueta.moverRaqueta();
        raquetas.moverRaqueta();
        miBola.mover();
    }
    
    @Override
    public void update(Graphics g){
        
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        raqueta.pintarRaqueta(g2d);
        raquetas.pintarRaqueta(g2d);
        miBola.paint(g2d);
    }

    @Override
    public void paint(Graphics g){

        update(g);
    }
    
    public Bola getMiBola() {
        return miBola;
    }
}
