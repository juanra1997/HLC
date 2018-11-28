/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

//import static buscaminas.Matriz.prueba;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Juanra
 */
public class Control {
    
    JButton[][] botones;
    int[][] minas;
    Matriz prueba=new Matriz();
    
    public Control(){
       
           
         botones=prueba.botones;
         minas=prueba.minas;
        /*for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                
                if(minas[i][j]==9){
                    botones[i][j].setText("M");
                    System.out.println("En "+i+", "+j+" hay mina");
                }else{
                    botones[i][j].setText("");
                }
            }
            System.out.println();
        }*/
        
        //---------------------------------------------------------
        /*for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                botones[i][j].addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    System.out.println("Hola");
                    }
                });
            }
        }*/
         for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                //System.out.println(i+","+j);
                /*botones[i][j]= new JButton("");
                 botones[i][j].setBackground(Color.CYAN);
                 //botones[i][j].
                 botones[i][j].adda*/
                //if(minas[i][j]==9){
                    botones[i][j] = new JButton();
                    String nombre = new Integer(i).toString();
                    nombre += new Integer(j).toString();
                    botones[i][j].setActionCommand(nombre);
                    //add(botones[i][j]);
               // }else{
                    /*botones[i][j] = new JButton();
                    String nombre = new Integer(i).toString();
                    nombre += new Integer(j).toString();
                    botones[i][j].setActionCommand(nombre);
                    add(botones[i][j]);*/
                //}
            }
        }
    }
    
}
