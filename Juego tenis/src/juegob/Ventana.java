/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegob;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements Runnable{
    
    Juego j=new Juego();
    
    public Ventana(String s){
        
        super(s);
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
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
