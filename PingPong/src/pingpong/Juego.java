/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Juego extends Canvas implements Runnable{

    Bola miBola;
    boolean jugando = false, pausado = false;
    long velocidad = 8;
    Raqueta izquierda, derecha;
    ImagenFondo imagen;
    private Image imagenaux;
    private Graphics gaux;
    private Dimension dimaux, dimcanvas;


    public Juego(int w, int h, int x, int y, JTextField i, JTextField d) {

        setBounds(w, h, x, y);
        
        
        
        dimcanvas=this.getSize();
        
        imagen=new ImagenFondo(this);
        
        miBola = new Bola(this, i, d);
        izquierda = new Raqueta(20, this);
        derecha = new Raqueta(this.getWidth() - 20 - 15, this);
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    derecha.dy = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    derecha.dy = 5;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    izquierda.dy = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_Z) {
                    izquierda.dy = 5;
                }
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    if(velocidad>1){
                        velocidad--;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_Z) {
                    izquierda.dy = 0;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    derecha.dy = 0;
                }
            }
        });
    }

    @Override
    public void update(Graphics g) {   
        paint(g);
    }
    
    
    
    @Override
    public void paint(Graphics g){

        if(gaux==null||dimaux==null||dimcanvas.width!=dimaux.width||dimcanvas.height!=dimaux.height){
            dimaux=dimcanvas;
            imagenaux=createImage(dimaux.width, dimaux.height);
            gaux=imagenaux.getGraphics();
        }
        imagen.paint(gaux);
        miBola.paint(gaux);
        izquierda.paint(gaux);
        derecha.paint(gaux);
        g.drawImage(imagenaux, 0, 0, this);
    }

    @Override
    public void run() {
        while (jugando) {
            while (pausado) {
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    //Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            miBola.mover();
            derecha.mover();
            izquierda.mover();
            repaint();
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
