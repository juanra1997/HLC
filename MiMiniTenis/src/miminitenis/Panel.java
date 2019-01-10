/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miminitenis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juanra
 */
public class Panel extends JPanel{
    
    JButton comenzar=new JButton("Inciar");
    JButton pausar=new JButton("Pausar");
    JButton salir=new JButton("Salir");
    JButton reiniciar=new JButton("Reiniciar");
    JLabel controles=new JLabel("Controles:");
    JLabel raquetas=new JLabel("Raqueta superior:");
    JLabel raquetai=new JLabel("Raqueta inferior:");
    JLabel flechai=new JLabel("Flecha izquierda");
    JLabel flechad=new JLabel("Flecha derecha");
    JLabel a=new JLabel("a");
    JLabel d=new JLabel("d");
    JLabel niveles=new JLabel("El nivel subirá cada 20 segundos");
    JLabel nivel=new JLabel("Nivel:");
    JTextField nivelt=new JTextField();
    
    public Panel(){
        
        setLayout(null);
        setBackground(Color.WHITE);
        
        comenzar.setBounds(30, 50, 100, 30);
        comenzar.setFocusPainted(false);
        add(comenzar);
        
        pausar.setBounds(160, 50, 100, 30);
        pausar.setFocusPainted(false);
        pausar.setEnabled(false);
        add(pausar);
        
        salir.setBounds(160, 100, 100, 30);
        salir.setFocusPainted(false);
        salir.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });
        add(salir);
        
        reiniciar.setBounds(30, 100, 100, 30);
        reiniciar.setFocusPainted(false);
        reiniciar.setEnabled(false);
        add(reiniciar);
        
        controles.setBounds(30, 150, 100, 30);
        add(controles);
        
        raquetas.setBounds(10, 180, 110, 30);
        add(raquetas);
        
        raquetai.setBounds(140, 180, 110, 30);
        add(raquetai);
        
        a.setBounds(50, 210, 10, 30);
        add(a);
        
        d.setBounds(50, 240, 10, 30);
        add(d);
        
        flechai.setBounds(145, 210, 100, 30);
        add(flechai);
        
        flechad.setBounds(145, 240, 100, 30);
        add(flechad);
        
        niveles.setBounds(45, 300, 200, 30);
        add(niveles);
        
        nivel.setBounds(45, 350, 200, 30);
        add(nivel);
        
        nivelt.setBounds(100, 350, 100, 30);
        nivelt.setEditable(false);
        nivelt.setBackground(Color.WHITE);
        nivelt.setHorizontalAlignment(JTextField.CENTER);
        nivelt.setText("0");
        add(nivelt);
    }
}
