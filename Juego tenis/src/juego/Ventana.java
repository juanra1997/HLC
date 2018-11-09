/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Dimension;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements Runnable{
    
    Dimension dim;
    Juego j;//=new Juego();
    
    public Ventana(String s, Dimension d){
        
        super(s);
        dim=d;
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        j=new Juego(dim);
        add(j);
        mover();
    }
    
    public void mover(){
        
        
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(true){
            j.mover();
            j.repaint();
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
