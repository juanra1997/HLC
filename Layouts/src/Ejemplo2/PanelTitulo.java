/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class PanelTitulo extends JPanel {
    
    JLabel tit=new JLabel("CALCULADORA");
    
    public void iniciaComponentes(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(tit);
    }
    
    public PanelTitulo(){
        
        iniciaComponentes();
    }
}
