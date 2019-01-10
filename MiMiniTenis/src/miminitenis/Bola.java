/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miminitenis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanra
 */
public class Bola {
    
    int x=1, y=1, dx=1, dy=1, posx, posy;
    Juego miJuego;
    Panel panel;
    Ventana ventana;
    
    public Bola(Juego m, Panel p, Ventana v){
        
        miJuego=m;
        panel=p;
        ventana=v;
    }
    
    public void mover(){
        
        
        if(x==miJuego.getWidth()-30){
            dx=-1;
            Sonidos.SOUNDPELOTA.play();
        }
        if(y==miJuego.getHeight()-30){    
            dy=-1;
            Sonidos.SOUNDPELOTA.play();
        }
        if(y==miJuego.getHeight()-30){
            Sonidos.SOUNDGAMEOVER.play();
            gameOver();
            
        }
        if(y==0){
            Sonidos.SOUNDGAMEOVER.play();
            gameOver();
            
        }
        if(x==0){
            dx=1;
            Sonidos.SOUNDPELOTA.play();
        }
        if(y==0){
            dy=1;
        }
        x=x+dx;
        y=y+dy;
        
        if(miJuego.raqueta.devolverRaqueta().intersects(this.devolverPelota())){
            dy=-1;
            Sonidos.SOUNDPELOTA.play();
        }
        
        if(miJuego.raquetas.devolverRaqueta().intersects(this.devolverPelota())){
            dy=+1;
            Sonidos.SOUNDPELOTA.play();
        }
    }
    
    public void paint(Graphics g){
        
        Graphics2D g2d=(Graphics2D)g;
        g2d.setColor(Color.BLACK);
        //No le activo esto ya que si se lo activo, en mi ordenador parpadea mucho mas
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }
    
    public void gameOver(){
        Ventana.fin=true;
        JOptionPane.showMessageDialog(null, "Fin del juego");
        ventana.terminado=true;
        panel.nivelt.setText("Fin");
        panel.pausar.setEnabled(false);
    }
    
    public Rectangle devolverPelota(){
        return new Rectangle(x, y, 30, 30);
    }
}
