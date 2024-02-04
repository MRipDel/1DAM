/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_13_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Escribe un programa que lee dos números y los visualiza en orden ascendente.
*/
public class Ej_13_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int  num1,num2;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        
        num1= pregunta.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        
        num2= pregunta.nextInt();
        
        if(num1>num2){
        
            System.out.println(num2 + ", "+ num1);
            
        }else if(num1<num2){
        
            System.out.println(num1 + ", " + num2);
            
        }else{
        
            System.out.println("Son iguales, no te muestro nada.");
            
        }
        
        
    }
    
}
