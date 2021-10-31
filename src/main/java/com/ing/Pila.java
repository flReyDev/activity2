package com.ing;

import java.util.Scanner;

/**
 *
 * @author leonardo
 * Ejercicio del video relacionada en la actividad 2
 * Implementación de una pila
 */
public class Pila {
    
    private final Scanner sc;
    private int maxElementos = -1;
    private final int pila[] = new int[5];
    
    public Pila(){
    
        sc = new Scanner(System.in);
        
    }
    
    
    public void agregar(){
        
        if(this.maxElementos >= pila.length-1){
            System.out.println("Pila llena");
        }else{
            
            this.maxElementos +=1;
            System.out.println("Ingresa el numero: ");
            this.pila[this.maxElementos] = sc.nextInt();
            
        }
        
    }
    
    public void eliminar(){
    
        if(this.maxElementos == -1){
            System.out.println("Pila vacia!");
        }else{
            
            this.pila[this.maxElementos] = 0;
            System.out.println("Elemento eliminado.");
    
        }
        
    }
    
    public void mostrar(){
        
        for (int i = this.pila.length-1; i>=0; i--) {
            System.out.println("Elementos de la pila: "+ this.pila[i]);
        }
        
    }
    
    public void menu(){
    
        int opcion = 0;
    
        while(opcion != 4){
            
            System.out.println("Menu de pila: Ingrese la opción que desea ejecutar");
            System.out.println("Preciona 1 para agregar dato a la pila");
            System.out.println("Preciona 2 para eliminar datos de la pila");
            System.out.println("Preciona 3 para mostrar los elementos en la pila");
            System.out.println("Preciona 4 para salir");
            
            opcion = sc.nextInt();
            
            
            switch(opcion){
             case 1:
                 this.agregar();
                 break;
                 case 2:
                     this.eliminar();
                     break;
                     case 3:
                         this.mostrar();
                         break;
                         case 4:
                             break;
                             default:
                                 System.out.println("Preciona una opción valida");
            }
            
            
        }
    }
    
    
}
