/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ing;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class Ordenamiento {
    
    private int arreglo[];
    
    private int nElementos;
    private int aux;
    
    private Scanner scanner;
    
    public Ordenamiento(){
        this.scanner = new Scanner(System.in);
    }
    
    
    public void execute(){
        
        
        this.nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita el tamaño del arreglo"));
        this.arreglo = new int[nElementos];
        
        for (int i = 0; i < this.nElementos; i++) {
            System.out.println(i+1+" Ingresa el numero");
            this.arreglo[i] = this.scanner.nextInt();
        }
    
        //ordenar
        
        for (int i = 0; i < (this.nElementos -1); i++) {
            for (int j = 0; j < (this.nElementos -1); j++) {
                if(this.arreglo[j] > this.arreglo[j+1]){
                    this.aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = this.aux; 
                }
            }
        }
        
        //mostar
        
        for (int i = 0; i < this.nElementos; i++) {
            System.out.println(this.arreglo[i] + " - ");
        }
        System.out.println("");
        
        
        
        //ordenar en forma descendente
        
        for (int i = (this.nElementos - 1); i >= 0; i--) {
            System.out.println(this.arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
    
}
