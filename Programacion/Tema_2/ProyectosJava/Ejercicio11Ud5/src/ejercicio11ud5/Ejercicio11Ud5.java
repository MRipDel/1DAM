/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11ud5;

/**
 *
 * @author Manuel Ripalda
 */

/*Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
*/
public class Ejercicio11Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num,par,impar;
        
        par=0;
        
        impar=0;
        
        for (num=100; num<=200 ; num++) {
            
            if (num%2==0){
            
                par+=num;
                
            }else{
            
            impar+=num;
            
            }
            
        }
        
        System.out.println("Los números pares suman "+par+".");
        
        System.out.println("Los números impares suman "+impar+".");
        
    }
}
