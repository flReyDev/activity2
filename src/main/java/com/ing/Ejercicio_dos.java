/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ing;


/**
 *
 * @author leonardo
 */
public class Ejercicio_dos {
    
        private final int TAM = 5;
        private final char[][] triangulo = new char[TAM][TAM];
        
 
        
        public Ejercicio_dos(){}
        
        
        public void cargar(){
            
                //Cargar matriz con el dibujo
         for(int f=0; f<TAM; f++) {
             //Bucle para mostrar espacios
             for(int c=0; c<f; c++)
                 triangulo[f][c] = ' ';
             //Bucle para mostrar asteriscos
             for(int c=f; c<TAM; c++)
                 triangulo[f][c] = '*';
         }
        
        }
        
        public void mostrar(){
                //Mostrar matriz en pantalla
                for(int f=0; f<TAM; f++) {
                for(int c=0; c<TAM; c++)
                    System.out.print(triangulo[f][c]);
                System.out.println();
            }
                
            // reflejar a la izquierda
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        
    
    
    
    
}
