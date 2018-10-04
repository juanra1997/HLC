/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanra
 */
public class PanelSuperior extends JPanel {
    
    JLabel titulo;
    
    public PanelSuperior(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        titulo=new JLabel("CONVERSOR DE MONEDAS");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        add(titulo);
        
        setBackground(Color.WHITE);
    }
}
