/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springlayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Juanra
 */
public class Sumas {
    
    //Creamos el metodo main
    
    public static void main(String[] args){
        
        //Creamos un objeto MiVentanaS y le damos visibilidad
        
        MiVentanaS obj=new MiVentanaS();
        obj.setVisible(true);
    }
}

//Cremaos y extendemos de JFrame la clase de la ventana

class MiVentanaS extends JFrame {
    
    //Creamos los objetos a usar
    
    SpringLayout layout=new SpringLayout();
    Container c=this.getContentPane();
    JTextField op1=new JTextField();
    JTextField op2=new JTextField();
    JTextField res=new JTextField();
    JLabel l=new JLabel("+");
    JLabel l2=new JLabel("=");
    JButton s=new JButton("Sumar");
    
    //Creamos el constructor por defecto
    
    public MiVentanaS(){
        
        //Llamamos al metodo que crea la ventana
        
        iniciaComponentes();
    }
    
    
    //Creamos el metodo que crea la ventana
    
    public void iniciaComponentes(){
        
        //Creamos la ventana
        
        setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Spring Layout");
        setSize(320, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        
        //Añadimos y colocamos los componentes
        
        //Otra cosa a destacar es que SpringLayout respeta siempre que puede el PreferredSize
        
        op1.setPreferredSize(new Dimension(60, 40));
        op1.setHorizontalAlignment(JTextField.CENTER);
        op1.addKeyListener(new KeyListener() {

            //Aqui hacemos que si intentan introducir algo diferente a numeros, lo borra
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(e.getKeyChar()<'0'||e.getKeyChar()>'9'){
                    e.consume();
            }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(op1);
        
        add(l);
        
        op2.setPreferredSize(new Dimension(60, 40));
        op2.setHorizontalAlignment(JTextField.CENTER);
        op2.addKeyListener(new KeyListener() {

            //Aqui hacemos que si intentan introducir algo diferente a numeros, lo borra
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(e.getKeyChar()<'0'||e.getKeyChar()>'9'){
                    e.consume();
            }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(op2);
        
        add(l2);
        
        res.setEditable(false);
        res.setPreferredSize(new Dimension(60, 40));
        res.setHorizontalAlignment(JTextField.CENTER);
        add(res);
        
        //Aqui le damos funcionalidad al boton
        
        s.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(op1.getText().length()!=0&&op2.getText().length()!=0){
                    res.setText(String.valueOf(Double.parseDouble(op1.getText())+Double.parseDouble(op2.getText())));
                }
            }
        });
        add(s);
        
        layout.putConstraint(SpringLayout.NORTH, op1, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, op1, 20, SpringLayout.WEST, c);
        
        layout.putConstraint(SpringLayout.NORTH, l, 30, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, l, 20, SpringLayout.EAST, op1);
        
        layout.putConstraint(SpringLayout.NORTH, op2, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, op2, 20, SpringLayout.EAST, l);
        
        layout.putConstraint(SpringLayout.NORTH, l2, 30, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, l2, 20, SpringLayout.EAST, op2);
        
        layout.putConstraint(SpringLayout.NORTH, res, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, res, 20, SpringLayout.EAST, l2);
        
        layout.putConstraint(SpringLayout.NORTH, s, 20, SpringLayout.SOUTH, op2);
        layout.putConstraint(SpringLayout.WEST, s, 20, SpringLayout.WEST, l);
    }
}
