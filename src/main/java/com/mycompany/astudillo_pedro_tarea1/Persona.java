/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astudillo_pedro_tarea1;

/**
 *
 * @author TUF GAMING
 */
public class Persona {
  //Atributos
    String nombre;
    String fechadenacimiento;
    int edad;
    String sexo;
    
    //Metodo
    public static void main(String [] args){ 
        Persona persona1 = new Persona();
        
        persona1.nombre = "Samanta";
        persona1.fechadenacimiento = "10/5/99";
        persona1.edad = 22;
        persona1.sexo = "Mujer"; 
        
        System.out.println("El nombre de la persona es: "+persona1.nombre);
        System.out.println("La fecha de nacimiento de la persona es: "+persona1.fechadenacimiento);        
        System.out.println("La edad de la persona es: "+persona1.edad);
        System.out.println("El sexo de la persona es: "+persona1.sexo);
    }  
}
