/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio21_ud5;

import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares.
*/
public class Ejercicio21_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b,pares;
        
        Scanner pregunta=new Scanner(System.in);
        
        pares=0;
        
        do{
            System.out.println("Introduce A:");
            
            a=pregunta.nextInt();
            
            System.out.println("Introduce B:");
            
            b=pregunta.nextInt(); 

        }while(a>=b);

        for (int i=a; i <=b; i++) {
            
            if(i%2==0){
            
                System.out.print(i+" ");
             
                pares++;
            }
        }
        
        System.out.println("\nLa cantidad de pares es: "+pares);
        
    }  
}
