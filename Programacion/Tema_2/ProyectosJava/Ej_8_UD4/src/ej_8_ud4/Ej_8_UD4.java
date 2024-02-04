/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_8_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de
edad” solo si lo somos*/
public class Ej_8_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        
        edad= pregunta.nextInt();
        
        if (edad>=18){
        
            System.out.println("Eres mayor de edad");
            
        }

        
        
       
        
    }
    
}
