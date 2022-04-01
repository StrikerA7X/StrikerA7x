/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astudillo_pedro_tarea1;

/**
 *
 * @author TUF GAMING
 */
public class Pelota {
    String color;
    float peso;
    float diametro;
    String marca;
    
        //Metodo
    public static void main(String [] args){ 
        Pelota pelota1 = new Pelota();
        
        pelota1.color = "Blanco" ;
        pelota1.peso =410 ;
        pelota1.diametro = 21;
        pelota1.marca = "MIKASA FT5"; 
        
        System.out.println("El color de la pelota es: "+pelota1.color);
        System.out.println("El peso de la pelota es: "+pelota1.peso);        
        System.out.println("El diametro de la pelota es: "+pelota1.diametro);
        System.out.println("La marca de la pelota es: "+pelota1.marca);
    }
    

}
  

