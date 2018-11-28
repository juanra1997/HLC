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
    static boolean fin=false;
    int velocidad=12, velocidadActual;
    long tiempoJuego=System.currentTimeMillis();
    long tiempo;
    
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
        velocidadActual=velocidad;
        while(!fin){
            if(tiempo==20&&velocidadActual>1){
                velocidadActual=velocidadActual-1;
                tiempoJuego=System.currentTimeMillis();
            }
            j.mover();
            j.repaint();
            try {
                sleep(velocidadActual);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo=(int)((System.currentTimeMillis()-tiempoJuego)/1000);
            //System.out.println(velocidadActual);
        }
    }
}
