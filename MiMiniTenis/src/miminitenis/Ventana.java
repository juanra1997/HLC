/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miminitenis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements Runnable{
    
    Panel p=new Panel();
    Juego j=new Juego();
    static boolean fin=false;
    int velocidad=12, velocidadActual;
    long tiempoJuego=System.currentTimeMillis();
    long tiempo;
    JButton comenzar=new JButton("Comenzar");
    
    public Ventana(){
        
        setLayout(null);
        iniciaComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        p.setPreferredSize(new Dimension(200, 500));
       // add(p, BorderLayout.LINE_END);
        //add((new Panel()).setPreferredSize(new Dimension(200, 500)), BorderLayout.LINE_END);
    }
    
    public void iniciaComponentes(){
        
        
        j.setBounds(00, 00, 300, 465);
        j.setBackground(Color.CYAN);
        add(j);
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
