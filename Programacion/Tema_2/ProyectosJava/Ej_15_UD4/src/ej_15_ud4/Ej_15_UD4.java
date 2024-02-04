/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_15_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/* Escribe un programa que lea tres números distintos y nos diga cuál es el 
mayor.*/
public class Ej_15_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int  num1,num2,num3;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.print("Primer número: ");
        
        num1= pregunta.nextInt();
        
        System.out.print("Segundo número: ");
        
        num2= pregunta.nextInt();
        
        System.out.print("Tercer número: ");
        
        num3= pregunta.nextInt();
        
        if(num1>num2 && num1>3){
            
            System.out.println(num1+  " es  el mayor.");
            
        }else if(num2>num1 && num2>3){
        
            System.out.println(num2+  " es  el mayor.");
            
        }else{
        
        System.out.println(num3+  " es  el mayor.");
            
        }
        
    }
    
}
