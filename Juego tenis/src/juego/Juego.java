/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas {
    
    private Dimension dim, dimaux;
    private Image imaux;
    private Graphics gaux;
    
    public Juego(Dimension d){
        miBola=new Bola(this);
        dim=d;
    }
    
    Bola miBola=new Bola(this);
    
    public void mover(){
        
        miBola.mover();
    }
    
    @Override
    public void update(Graphics g){
        
        //super.paint(g);
        if(dimaux==null||imaux==null){
        //Graphics2D g2d=(Graphics2D)g;
        //miBola.paint(g2d);
        dimaux=dim;
        imaux=createImage(dimaux.width, dimaux.height);
        gaux=imaux.getGraphics();
        }
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        miBola.paint(g);
        g.drawImage(imaux, 0, 0, this);
    }

    @Override
    public void paint(Graphics g){
        /*Graphics2D g2d=(Graphics2D)gaux;
        miBola.paint(g2d);
        g.drawImage(imaux, 0, 0, this);*/
        update(g);
    }
    
    public Bola getMiBola() {
        return miBola;
    }
}
