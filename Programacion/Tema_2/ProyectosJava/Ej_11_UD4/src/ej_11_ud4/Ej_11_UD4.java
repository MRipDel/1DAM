/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_11_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*Escribe un programa que lee 2 números y muestra el mayor.
*/
public class Ej_11_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1,num2;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        num1=pregunta.nextInt();
        System.out.println("Introduce otro número:");
        num2=pregunta.nextInt();
        
        while (num1==num2){
            System.out.println("Los números no pueden ser el mismo. Cambia el"
            + " primero:");
            num1=pregunta.nextInt();
        }
                
        if (num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        }else{
        

        }
    }
    
}
