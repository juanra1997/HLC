/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanra
 */
public class PanelCentral extends JPanel {
    
    JLabel cantidad;
    JTextField introduccion;
    
    public PanelCentral(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        add(Box.createRigidArea(new Dimension(0,50)));
        
        cantidad=new JLabel("Introduce una cantidad");
        cantidad.setFont(new Font("Arial", Font.BOLD, 20));
        cantidad.setAlignmentX(CENTER_ALIGNMENT);
        add(cantidad);
        
        add(Box.createRigidArea(new Dimension(0,20)));
        
        introduccion=new JTextField();
        introduccion.setPreferredSize(new Dimension(30, 30));
        introduccion.setAlignmentX(CENTER_ALIGNMENT);
        introduccion.setHorizontalAlignment(JTextField.CENTER);
        introduccion.setFont(new Font("Arial", Font.BOLD, 30));
        introduccion.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        introduccion.setBackground(Color.BLACK);
        introduccion.setForeground(Color.WHITE);
        add(introduccion);

        add(Box.createRigidArea(new Dimension(0,100)));
        
        setBackground(Color.WHITE);
    }

    public JTextField getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(JTextField introduccion) {
        this.introduccion = introduccion;
    }
    
}
