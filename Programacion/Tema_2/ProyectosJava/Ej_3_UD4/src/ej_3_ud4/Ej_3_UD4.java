/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_3_ud4;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ej_3_UD4 {

    /**
     * Escribe un programa que calcule el área de un cuadrado cuyo lado se 
     * introduce por teclado.
     */
    public static void main(String[] args) {
    
    int lado;
    //Declara el objeto pregunta de la clase Scanner.
    Scanner pregunta= new Scanner(System.in);
    
    System.out.print("Introduce un lado: ");
    
    lado=pregunta.nextInt();
    
    System.out.println("El área del cuadrado es de "+Math.pow(lado,2)+ " metros cuadrados.");
            
            
    
    }
    
}
