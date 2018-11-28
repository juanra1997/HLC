/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanra
 */
public class Matriz /*implements ActionListener*/{
    
    int[][] minas=new int[8][8];
    //miPanel prueba=new miPanel();
    
    //Ventana obj=new Ventana();
    //JButton[][] botones=obj.panel.botones;//=new JButton[8][8];
    
    
    /*public static void main(String[] args){
        
       
        
        rellenarMatriz();
        ponerMinas();
        pintarMatriz();
        //pintarMinas();
                
                
                /*int cont=0;
        while(cont<10){
            int prueba= (int)(Math.random()*6+1);
        System.out.println(prueba);
        cont++;*/
    //}
        /*Ventana obj=new Ventana();
        obj.setVisible(true);
    }*/

    public void rellenarMatriz(){
        
        for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                minas[i][j]=-1;
            }
        }
    }
    
    public void ponerMinas(){
        
        int cont=0;
        while(cont<5){
            for(int i=0; i<minas.length; i++){
                for(int j=0; j<minas[i].length; j++){
                    if((int)(Math.random()*5+1)==1){
                        if(cont<5){
                            minas[i][j]=9;
                            cont++;
                        }
                    }
                }
            }
        }
    }
    
    public void completarMatriz(){
        
    }
    
    public void pintarMatriz(){
        
        for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                System.out.print("\t"+minas[i][j]);
            }
            System.out.println();
        }
    }
    
    /*public void pintarMinas(){
           
        botones=obj.panel.botones;
        for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                
                if(minas[i][j]==9){
                    //botones[i][j].setText("M");
                    //botones[i][j].setActionCommand(botones[i][j].getActionCommand()+"M");
                    //botones[i][j].addActionListener(new MyListener(i, j));
                    //System.out.println("En "+i+", "+j+" hay mina");
                }else{
                    botones[i][j].setText("");
                }
            }
            //System.out.println();
        }
        
        //---------------------------------------------------------
        /*for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                 //System.out.println("En "+i+", "+j+" hay mina");
                botones[i][j].addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    System.out.println("Hola");
                    }
                });
            }
        }*/
    //}
    //Control c=new Control();
}
/*class MyListener implements ActionListener{


    int myi, myj;
    int[][] prueba;
    
    public MyListener(/*int[][] m, *///int i, int j){
       
        /*myi=i;
        myj=j;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       if(prueba[myi][myj]==9){
           JOptionPane.showMessageDialog(null, myi+", "+myj);
       }
    }

    
}*/

//matriz de 4 filas y 5 columnas