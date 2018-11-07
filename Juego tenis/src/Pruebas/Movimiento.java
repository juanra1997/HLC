/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Movimiento extends Canvas{
    
    static int x=0, y=0, dx=1, dy=1;
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f=new JFrame("Mini tenis");
        Movimiento movimiento=new Movimiento();
        f.add(movimiento);
        f.setSize(300, 400);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        while(true){
            movimiento.mover();
            movimiento.repaint();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public /*static */void mover(){
        
        x=x+dx;
        y=y+dy;
        if(/*x==265*/x==this.getWidth()-30){
            dx=-1;
        }
        if(/*y==337*/y==this.getHeight()-30){
            dy=-1;
        }
        if(x==0){
            dx=1;
        }
        if(y==0){
            dy=1;
        }
    }
    //--------------------------------------------------------------------------
    @Override
    public void update(Graphics g){
        
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.BLACK);
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
        /*g2d.drawOval(50, 50, 50, 50);
        g2d.drawOval(200, 50, 50, 50);
        g2d.fillRect(130, 80, 40, 40);
        g2d.drawRect(200, 10, 50, 50);
        g2d.draw(new Ellipse2D.Double(10, 200, 80, 80));*/
    }
    
    //--------------------------------------------------------------------------
    
    @Override
    public void paint(Graphics g){
        paint(g);
    }
    
    //--------------------------------------------------------------------------
}
