/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astudillo_pedro_tarea1;

/**
 *
 * @author TUF GAMING
 */
public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    String modelo;
    
    
    //Metodo
    public static void main(String [] args){ 
        Coche coche1 = new Coche();
        
        coche1.marca = "Audi";
        coche1.modelo = "R8";
        coche1.km = 0;
        coche1.color = "Blanco"; 
        
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);        
        System.out.println("El kilometraje del coche es: "+coche1.km);
        System.out.println("El modelo del coche es: "+coche1.modelo);
    }
    

}
