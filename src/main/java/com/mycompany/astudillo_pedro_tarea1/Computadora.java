/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astudillo_pedro_tarea1;

/**
 *
 * @author TUF GAMING
 */
public class Computadora {
    //Atributos
    String color;
    String marca;
    int espacio ;
    int ram ;
    
    
    //Metodo
    public static void main(String [] args){ 
        Computadora computadora1 = new Computadora();
        
        computadora1.color = "negro";
        computadora1.marca= "Asus";
        computadora1.espacio = 500;
        computadora1.ram = 16; 
        
        System.out.println("El color de la computadora es: "+computadora1.color);
        System.out.println("La marca de la computadora es: "+computadora1.marca);        
        System.out.println("El espacio de la computadora es: "+computadora1.espacio);
        System.out.println("La ram de la computadora es de: "+computadora1.ram);
    }
}
