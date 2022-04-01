/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astudillo_pedro_tarea1;

/**
 *
 * @author TUF GAMING
 */
public class Perro {

//Atributos
    public String nombre;
    public String raza;
    public int edad;
    public float peso;
    
    
    //Metodo
    public static void main(String [] args){ 
        Perro perro1 = new Perro();
        
        perro1.nombre = "Max";
        perro1.raza = "Golden";
        perro1.edad = 8;
        perro1.peso = 34 ; 
        
        System.out.println("El nombre del perro es: "+perro1.nombre);
        System.out.println("La raza del perro es: "+perro1.raza);        
        System.out.println("La edad del perro es: "+perro1.edad);
        System.out.println("El peso del perro es de: "+perro1.peso);
    }    
}
