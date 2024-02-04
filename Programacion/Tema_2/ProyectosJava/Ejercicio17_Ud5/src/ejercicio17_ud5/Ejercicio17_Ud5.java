/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio17_ud5;

import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.
*/
public class Ejercicio17_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num,numIni,fallados,introducidos;
        
        Scanner pregunta=new Scanner(System.in);
        
        fallados=0;
        
        introducidos=1;
        
        System.out.println("Di un número inicial");
        
        numIni=pregunta.nextInt();
        
        do{
        
            System.out.println("Dime otro número:");
            
            num=pregunta.nextInt();
            
            if (numIni<num){
                
                num=numIni;
                
                introducidos+=1;
                
            }else if (num==0){
                    
            }else if(numIni>=num){
                
                System.out.println("Ese número no es válido.");
                
                fallados+=1;
                
                introducidos+=1;
  
            }
        }while (num!=0);
        
        System.out.println("Has introducido "+introducidos+" números.\nHas "
                + "fallado "+fallados+" númmeros.");
        
    }

}
