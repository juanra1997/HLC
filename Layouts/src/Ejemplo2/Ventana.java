/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juanra
 */
public class Ventana extends JFrame {
    
    public void iniciaComponentes(){
        
        //BorderLayout bl=new BorderLayout(5, 5);
        setLayout(new BorderLayout(5, 5));
        PanelInferior pi=new PanelInferior();
        add(pi, BorderLayout.PAGE_END);
        PanelReset pr=new PanelReset();
        add(pr, BorderLayout.LINE_START);
        PanelOperaciones po=new PanelOperaciones();
        add(po, BorderLayout.CENTER);
        PanelCalcular pc=new PanelCalcular();
        add(pc, BorderLayout.LINE_END);
        PanelTitulo pt=new PanelTitulo();
        add(pt, BorderLayout.PAGE_START);
        setLocationRelativeTo(null);
        pack();
    }
    
    public Ventana(){
        
        //setLocationRelativeTo(null);
        iniciaComponentes();
    }
}
