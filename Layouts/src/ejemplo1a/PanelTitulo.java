/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1a;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juanra
 */
public class PanelTitulo extends JPanel {
    
    private JLabel lbTitulo;
    
    public PanelTitulo(){
        
        iniciaComponentes();
    }
    
    //--------------------------------------------------------------------------
    
    public void iniciaComponentes(){
        
        lbTitulo=new JLabel("### EJEMPLOS CON PANELES ###");
        FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
        /*this.*/setLayout(fl);
        /*this.*/add(lbTitulo);
    }
}
