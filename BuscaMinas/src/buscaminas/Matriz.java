/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Juanra
 */
public class Matriz {
    
    static int[][] minas=new int[4][5];
    
    public static void main(String[] args){
        
        rellenarMatriz();
        ponerMinas();
        pintarMatriz();
                
                
                /*int cont=0;
        while(cont<10){
            int prueba= (int)(Math.random()*6+1);
        System.out.println(prueba);
        cont++;*/
    //}
    }

    public static void rellenarMatriz(){
        
        for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                minas[i][j]=-1;
            }
        }
    }
    
    public static void ponerMinas(){
        
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
    
    public static void completarMatriz(){
        
    }
    
    public static void pintarMatriz(){
        
        for(int i=0; i<minas.length; i++){
            for(int j=0; j<minas[i].length; j++){
                System.out.print("\t"+minas[i][j]);
            }
            System.out.println();
        }
    }
}

//matriz de 4 filas y 5 columnas