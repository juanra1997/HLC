/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miminitenis;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame implements Runnable, ActionListener {
    
    Panel p = new Panel();
    Juego j = new Juego(p, this);
    static boolean fin = false;
    boolean terminado=false;
    int velocidad = 12, velocidadActual;
    long tiempoJuego = System.currentTimeMillis();
    long tiempo;
    
    public Ventana() {
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        iniciaComponentes();

    }
    
    public void iniciaComponentes() {
        
        j.setBounds(00, 00, 300, 465);
        j.setBackground(Color.CYAN);
        add(j);
        
        p.setBounds(300, 0, 294, 465);
        p.comenzar.addActionListener(this);
        p.comenzar.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                j.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        p.pausar.addActionListener(this);
        p.reiniciar.addActionListener(this);
        p.reiniciar.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                j.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(p);
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        velocidadActual = velocidad;
        String level=null;
        while(!terminado){
        while (!fin) {
            p.nivelt.setText(String.valueOf(13-velocidadActual));
            if (tiempo == 20 && velocidadActual > 1) {
                velocidadActual = velocidadActual - 1;
                tiempoJuego = System.currentTimeMillis();
            }
            j.mover();
            j.repaint();
            try {
                sleep(velocidadActual);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo = (int) ((System.currentTimeMillis() - tiempoJuego) / 1000);
        }
        if(!terminado){
        p.nivelt.setText("Juego parado");
        }
            
        }

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == p.comenzar) {
            Thread juego = new Thread(this);
            juego.start();
            p.pausar.setEnabled(true);
            p.comenzar.setEnabled(false);
        }
        
        if (e.getSource() == p.pausar) {
            fin=true;
            p.reiniciar.setEnabled(true);
            p.pausar.setEnabled(false);
        }
        
        if (e.getSource() == p.reiniciar) {
            fin=false;
            p.pausar.setEnabled(true);
            p.reiniciar.setEnabled(false);
        }
    }
}
