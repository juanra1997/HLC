
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
public class PanelDerecho extends JPanel {
    
    JLabel monedaDestino;
    JLabel titulo;
    JTextField cantidad;
    
    public PanelDerecho(){
        
        iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        titulo=new JLabel("Moneda Destino");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setAlignmentX(CENTER_ALIGNMENT);
        add(titulo);
        
        monedaDestino=new JLabel("$");
        monedaDestino.setFont(new Font("Arial", Font.BOLD, 200));
        monedaDestino.setAlignmentX(CENTER_ALIGNMENT);
        add(monedaDestino);
           
        cantidad=new JTextField();
        cantidad.setEditable(false);
        cantidad.setPreferredSize(new Dimension(100, 25));
        cantidad.setAlignmentX(CENTER_ALIGNMENT);
        cantidad.setHorizontalAlignment(JTextField.CENTER);
        cantidad.setFont(new Font("Arial", Font.BOLD, 20));
        cantidad.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        cantidad.setBackground(Color.BLACK);
        cantidad.setForeground(Color.WHITE);
        add(cantidad);
        
        setBackground(Color.WHITE);
    }

    public JTextField getCantidad() {
        return cantidad;
    }

    public void setCantidad(JTextField cantidad) {
        this.cantidad = cantidad;
    }
    
}
