/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_3_ud5;

/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Esta vez
utiliza un contador sumando de 1 en 1. 
*/
public class Ej_3_UD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        for (num = 2; num < 202; num++) {
            
            if(num%2==0){
                
                System.out.println(num);
                
            }
        }
    }
    
}
