/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    }
}
