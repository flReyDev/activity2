/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ing;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Ejercicio_uno {
    
        private int FILAS = 0;
        private int COLUMNAS = 0;
        private char[][] letras;
        
        
        public Ejercicio_uno(){}
        
        
        
        public void cargar(){
            
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Ingresa la cantidad de filas!");
            FILAS = sc.nextInt();

            System.out.println("Ingresa la cantidad de columnas!");
            COLUMNAS = sc.nextInt();

            letras = new char[FILAS][COLUMNAS];
            char letraQueToca = 'A';

           
            //Carga las letras en la matriz
            for(int f=0; f<FILAS; f++) {
                for(int c=0; c<COLUMNAS; c++) {
                    letras[f][c] = letraQueToca;
                    letraQueToca++;
                }
            }
        }
 
       
        
        public void mostrar(){
            //Mostrar en pantalla la matriz
            for(int f=0; f<FILAS; f++) {
                for(int c=0; c<COLUMNAS; c++) {
                    System.out.print(letras[f][c]+" ");
                }
                System.out.println();
            }
        }
        
}
