/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_12_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el
cero como positivo.*/
public class Ej_12_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        
        num= pregunta.nextInt();
        
        if (num<0){
            System.out.println(num+" es negativo.");
        
        }else {
            System.out.println(num+" es positivo.");
        }
        
    }
    
}
