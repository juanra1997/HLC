/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Ventana1a extends JFrame {
    
    private PanelBotones pb;
    private PanelTexto pt;
    private PanelTitulo ptit;
    private JButton btnSalir;
    private JButton btnSaludo;
    private JTextField mensaje;
    
    public Ventana1a(){
        
        iniciaComponentes();
    }
    
    //--------------------------------------------------------------------------
    
    public void iniciaComponentes(){
        
        pb=new PanelBotones();
        pt=new PanelTexto();
        ptit=new PanelTitulo();
        btnSalir=pb.getBtnSalir();
        mensaje=pt.getTxt();
        Container lienzo=this.getContentPane();
        //Colocamos todo
        BorderLayout bl=new BorderLayout(5, 5);
        lienzo.setLayout(bl);
        lienzo.add(ptit, BorderLayout.PAGE_START);
        lienzo.add(pt, BorderLayout.CENTER);
        lienzo.add(pb, BorderLayout.PAGE_END);
        //lienzo.setPreferredSize(new Dimension(450, 20));
        lienzo.setSize(450, 20);
        //----------------------------------------------------------------------
        btnSaludo=pb.getBtnSaludo();
        btnSaludo.addActionListener(e->saludo());
        pack();
    }
    
    public void saludo(){
        
        String text=mensaje.getText().trim();
        if(text.length()==0){
            JOptionPane.showMessageDialog(this, "Introduce un salludo !!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Tu saludo es: "+text);
            mensaje.setText("");
        }
    }
}
