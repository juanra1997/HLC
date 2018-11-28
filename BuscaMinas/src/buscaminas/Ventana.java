/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame{
    
    miPanel panel;
    miPanelLateral lateral;
    /*Matriz prueba=new Matriz();
    int[][] minas=new int[8][8];*/
    
    public Ventana(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        /* setLayout(new GridLayout(8, 8));
        //JOptionPane.showMessageDialog(null, "hola");
        for(int i=0; i<64; i++){
            add(new JButton());
        }*/
        
        //----------------------------------------------------------------------
        //Descomentar esto
        panel=new miPanel();
        panel.setBorder(BorderFactory.createCompoundBorder());
        add(panel, BorderLayout.CENTER);
        //add(new JButton(), BorderLayout.NORTH);
        /*setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        //----------------------------------------------------------------------
        
        lateral=new miPanelLateral();
        lateral.setPreferredSize(new Dimension(150, 40));
        //lateral.setBorder(BorderFactory.createCompoundBorder());
        add(lateral, BorderLayout.LINE_END);
        
        
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*class miPanel extends JPanel {
    
    GridLayout gl=new GridLayout(8, 8);
    JButton[][] botones=new JButton[8][8];
    
    public miPanel(){
        
        iniciaComponentes();
    }
    public void iniciaComponentes(){
        
        setLayout(gl);
        setBackground(Color.WHITE);
        gl.setHgap(5);
        gl.setVgap(5);
        //JOptionPane.showMessageDialog(null, "hola");
        /*for(int i=0; i<64; i++){
            add(new JButton());
        }*/
        
        //----------------------------------------------------------------------
        //Descomentar esto
        /*for(int i=0; i<botones.length; i++){
            for(int j=0; j<botones[i].length; j++){
                //System.out.println(i+","+j);
                botones[i][j]= new JButton("");
                botones[i][j].setBackground(Color.CYAN);
            }
        }
        for(int i=0; i<botones.length; i++){
            for(int j=0; j<botones[i].length; j++){
                add(botones[i][j]);
            }
        }
        //add(new JButton("Hola"));
        
        setVisible(true);
        //----------------------------------------------------------------------
    }

}*/

class miPanelLateral extends JPanel {
    
    JButton iniciar, pausar, salir;
    JTextField banderas, tiempo;
    
    public miPanelLateral(){
        
        iniciaComponentes();
    }
    
    @Override
    public void paintComponent(Graphics g) {
		
        
        super.paintComponent(g);
            
        File fichero=new File("sintitulo.png");
        File fichero2=new File("34116.png");
        
        try {
            Image miImagen=ImageIO.read(fichero);
            g.drawImage(miImagen, 50, 10, null);
        } catch (IOException ex) {
            Logger.getLogger(miPanelLateral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Image miImagen=ImageIO.read(fichero2);
            g.drawImage(miImagen, 50, 100, null);
        } catch (IOException ex) {
            Logger.getLogger(miPanelLateral.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    public void iniciaComponentes(){
        
        setLayout(null);
        
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createCompoundBorder());
        
        iniciar=new JButton("INICIAR");
        
        iniciar.setBounds(25, 220, 100, 25);
        iniciar.setForeground(Color.BLUE);
        add(iniciar);
        
        pausar=new JButton("PAUSAR");
        
        pausar.setBounds(25, 260, 100, 25);
        pausar.setForeground(new Color(68, 121, 65));
        pausar.setEnabled(false);
        add(pausar);
        
        salir=new JButton("SALIR");
        
        salir.setBounds(25, 300, 100, 25);
        salir.setForeground(Color.RED);
        salir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        add(salir);
        
        banderas=new JTextField();
        
        banderas.setBackground(Color.BLACK);
        banderas.setForeground(Color.GREEN);
        banderas.setBounds(25, 60, 100, 25);
        banderas.setHorizontalAlignment(JTextField.CENTER);
        banderas.setText("00/10");
        add(banderas);
        
        tiempo=new JTextField();
        
        tiempo.setBackground(Color.BLACK);
        tiempo.setForeground(Color.GREEN);
        tiempo.setBounds(25, 160, 100, 25);
        tiempo.setHorizontalAlignment(JTextField.CENTER);
        tiempo.setText("00:00");
        add(tiempo);
    }

}