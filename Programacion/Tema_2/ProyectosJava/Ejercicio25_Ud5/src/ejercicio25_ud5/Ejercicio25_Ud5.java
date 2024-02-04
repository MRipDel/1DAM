/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio25_ud5;

import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
public class Ejercicio25_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner pregunta=new Scanner(System.in);
        
        int cantidad,numA,numB;
        
        System.out.println("Introduce un número y te devuelvo esa cantidad de"
                +" números de la sucesión de Fibonacci:");
        
        cantidad=pregunta.nextInt();
        
        numA=0;
        
        numB=1;
        
        System.out.print(numA+" ");
        
        for (int i = 1; i < cantidad; i++) {
            
            if (i%2==0) {
               
                numA+=numB;
                
                System.out.print(numA+" ");
                
            }else{
            
                numB+=numA;
                
                System.out.print(numB+" ");
                
            }
            
            
            
            
        }
    }

}
