/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio24_ud5;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio24_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  cifras,num_ini,num;

        
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        
        num=pregunta.nextInt();
        
        num_ini=num;
        
        cifras=0;
        
        while (num_ini>0){                                                      //Con este bucle se consigue el número de cifras.
        
            num_ini/=10;

            cifras++;
        
        }
        
        for (int i = 0; i < cifras; i++) {
      
            System.out.print(num%10);
            
            num/=10;
      
        }
        
        
    }

}
