/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_4_ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.*/
public class Ej_4_UD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num,fin;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.print("Introduce el número hasta donde contar:");
        
        fin=pregunta.nextInt();
        
        if (fin%2==1){
            
            fin-=1;
            
        }
        
        for (num=2;  num<(fin+2); num=num+2) {

            System.out.println(num);
        }
        
    }
    
}
