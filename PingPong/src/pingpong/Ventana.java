/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame{
    
    Juego miJuego;
    JButton inicio, parar, pausar, reiniciar, salir, mas;
    Thread hilo;
    JTextField tizquierda, tderecha;
    JMenuBar barra;
    JMenuItem item;
    
    public Ventana(){
        setLayout(null);
        setTitle("Ping pong Juan Raul Mellado Garcia");
        getContentPane().setBackground(Color.WHITE);
        setSize(706, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        tizquierda=new JTextField();
        tizquierda.setBounds(130, 520, 100, 30);
        tizquierda.setBackground(Color.BLACK);
        tizquierda.setForeground(Color.WHITE);
        tizquierda.setHorizontalAlignment(JTextField.CENTER);
        tizquierda.setText(String.valueOf("0"));
        tizquierda.setFocusable(false);
        tizquierda.setEnabled(false);
        add(tizquierda);
        
        tderecha=new JTextField();
        tderecha.setBounds(440, 520, 100, 30);
        tderecha.setBackground(Color.BLACK);
        tderecha.setForeground(Color.WHITE);
        tderecha.setHorizontalAlignment(JTextField.CENTER);
        tderecha.setText("0");
        tderecha.setFocusable(false);
        tderecha.setEnabled(false);
        add(tderecha);
        
        item=new JMenuItem("Info");
        barra=new JMenuBar();
        item.setBackground(Color.BLACK);
        item.setForeground(Color.WHITE);   
        item.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JOptionPane.showMessageDialog(null, "Controles:\nRaqueta izquierda: A y S\nRaqueta derecha: Flechas de direccion arriba y abajo\nBarra espaciadora: Aumentar velocidad\nBoton +++: Aumentar velocidad");
            }
        });
        barra.add(item);
        setJMenuBar(barra);
        
        miJuego=new Juego(0, 100, 700, 400, tizquierda, tderecha);

        add(miJuego);

        inicio=new JButton("Iniciar");
        inicio.setBackground(Color.CYAN);
        //inicio.setForeground(Color.WHITE);
        inicio.setBounds(102, 30, 100, 30);
        inicio.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //miJuego.jugando=true;
                tderecha.setText("0");
                tizquierda.setText("0");
                miJuego.velocidad=8;
                miJuego.jugando=true;
                miJuego.pausado=false;
                miJuego.miBola=new Bola(/*10, 10, */miJuego, tizquierda, tderecha);
                miJuego.izquierda = new Raqueta(20, miJuego);
                miJuego.derecha = new Raqueta(miJuego.getWidth() - 20 - 15, miJuego);
                hilo=new Thread(miJuego);
                hilo.start();
                inicio.setEnabled(false);
                parar.setEnabled(true);
                pausar.setEnabled(true);
                reiniciar.setEnabled(false);
                reiniciar.setVisible(false);
                pausar.setVisible(true);
            }
        });
        inicio.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(inicio);
        
        parar=new JButton("Parar");
        parar.setBackground(Color.RED);
        parar.setForeground(Color.WHITE);
        parar.setBounds(222, 30, 100, 30);
        parar.setEnabled(false);
        parar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.jugando=false;
                miJuego.pausado=false;
                inicio.setEnabled(true);
                parar.setEnabled(false);
                pausar.setEnabled(false);
                reiniciar.setEnabled(false);
                reiniciar.setVisible(false);
                pausar.setVisible(true);
            }
        });
        parar.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(parar);
        
        pausar=new JButton("Pausar");
        pausar.setBackground(Color.YELLOW);
        //pausar.setForeground(Color.WHITE);
        pausar.setBounds(342, 30, 100, 30);
        pausar.setEnabled(false);
        pausar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.pausado=true;
                reiniciar.setVisible(true);
                reiniciar.setEnabled(true);
                pausar.setVisible(false);
                pausar.setEnabled(false);
            }
        });
        pausar.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(pausar);
        
        reiniciar=new JButton("Reiniciar");
        reiniciar.setBackground(Color.GREEN);
        //reiniciar.setForeground(Color.WHITE);
        reiniciar.setBounds(342, 30, 100, 30);
        reiniciar.setVisible(false);
        reiniciar.setEnabled(false);
        reiniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.pausado=false;
                reiniciar.setVisible(false);
                reiniciar.setEnabled(false);
                pausar.setVisible(true);
                pausar.setEnabled(true);
            }
        });
        reiniciar.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(reiniciar);
        
        salir=new JButton("Salir");
        salir.setBackground(Color.BLACK);
        salir.setForeground(Color.RED);
        salir.setBounds(462, 30, 100, 30);
        salir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        salir.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(salir);
        
        mas=new JButton("+++");
        mas.setBackground(Color.BLACK);
        mas.setForeground(Color.RED);
        mas.setBounds(282, 520, 100, 30);
        mas.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.velocidad--;
            }
        });
        mas.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                miJuego.requestFocus();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(mas);
    }    
}
