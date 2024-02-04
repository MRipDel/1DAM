/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio20_ud5;

import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/* Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
valor.*/
public class Ejercicio20_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        
        Scanner pregunta=new Scanner(System.in);
        
        do{        
            System.out.print("Introduce un número del  1 al 20:");
        
            num=pregunta.nextInt();
            
        }while(num<1 || num>20);
        

        
        for (int i = 1; i <= num; i++) {
            
            for (int j =1; j <=i; j++) {
                
                System.out.print(i);
                
            }
            System.out.println("");
        }
        
    }

}
