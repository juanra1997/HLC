/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Hilo extends Thread {

    //Semaforo s=new Semaforo();
    boolean esperar;
    boolean juego=true;
    JTextField crono;
    long cuenta;
    String t;

    public Hilo(JTextField c) {
        crono = c;
    }

    @Override
    public void run() {
        String sec, min, cont;

        cont = crono.getText();
        min = cont.substring(0, 2);
        sec = cont.substring(3, 5);

        while (juego) {

            t = crono.getText();

            dormir(200);

            while (esperar) {

                crono.setText("");
                dormir(500);
                crono.setText(t);
                dormir(500);
                
            }
            dormir(200);

            while (esperar) {
                crono.setText("");
                dormir(500);
                crono.setText(t);
                dormir(500);
            }
            dormir(200);

            while (esperar) {
                crono.setText("");
                dormir(500);
                crono.setText(t);
                dormir(500);
            }
            dormir(200);

            while (esperar) {
                crono.setText("");
                dormir(500);
                crono.setText(t);
                dormir(500);
            }
            dormir(200);

            while (esperar) {
                crono.setText("");
                dormir(500);
                crono.setText(t);
                dormir(500);
            }

            if (Integer.parseInt(sec) == 59) {
                min = String.valueOf(Integer.parseInt(min) + 1);
                sec = "00";
                if (Integer.parseInt(min) < 10) {
                    min = "0" + min;
                    crono.setText(min + ":" + sec);
                } else {

                }
            } else {
                sec = String.valueOf(Integer.parseInt(sec) + 1);
                if (Integer.parseInt(sec) < 10) {
                    crono.setText(min + ":0" + sec);
                } else {
                    crono.setText(min + ":" + sec);
                }
            }

        }
    }

    public void dormir(long t) {
        try {
            sleep(t);
        } catch (InterruptedException ex) {
            //Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
