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
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Bola {
    
    int x=316, y=50, dx=1, dy=1;
    Juego miJuego;
    JTextField pderecha, pizquierda;

    public Bola(Juego j, JTextField i,JTextField d) {
        miJuego=j;
        pderecha=d;
        pizquierda=i;
    }

    public void paint(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x, y, 30, 30);
    }
    public void mover(){
        
        x=dx+x;
        y=dy+y;
        
        if(x==0){
            dx=1;
            JOptionPane.showMessageDialog(null, "Punto para la derecha");
            pderecha.setText(String.valueOf(Integer.parseInt(pderecha.getText())+1));
            x=316;
            y=50;
            miJuego.velocidad=8;
            //Sonidos.SOUNDGAMEOVER.play();
        }
        if(y==0){
            dy=1;         
            //Sonidos.SOUNDPELOTA.play();
        }
        if(x==miJuego.getWidth()-30){
            dx=-1;
            JOptionPane.showMessageDialog(null, "Punto para la izquierda");
            pizquierda.setText(String.valueOf(Integer.parseInt(pizquierda.getText())+1));
            x=316;
            y=50;
            miJuego.velocidad=8;
            //Sonidos.SOUNDGAMEOVER.play();
        }
        if(y==miJuego.getHeight()-30){
            dy=-1;
            //Sonidos.SOUNDPELOTA.play();
        }
        if(miJuego.derecha.devolverRaqueta().intersects(this.devolverBola())){
            dx=-1;
            //Sonidos.SOUNDPELOTA.play();
        }
        if(miJuego.izquierda.devolverRaqueta().intersects(this.devolverBola())){
            dx=1;
            //Sonidos.SOUNDPELOTA.play();
        }
    }
    public Rectangle devolverBola(){
        return new Rectangle(x, y, 30, 30);
    }
}
