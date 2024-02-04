/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_9_ud4;

import java.util.Scanner;

/**
 *
 * @author Manuel Ripalda
 */
/*
Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de
edad” o el mensaje de “eres menor de edad”.
*/
public class Ej_9_UD4 {

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
            
        }else{
                
            System.out.println("Eres menor de edad");
                
                }
        
    }
    
}
