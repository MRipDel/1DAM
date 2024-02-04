/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_6_ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído
algún número negativo o no.*/
public class Ej_6_UD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nums;
        int neg=0;
        
        Scanner pregunta=new Scanner(System.in);
        
        for (int i = 0;  i< 10; i++) {
            
            nums=pregunta.nextInt();
            
            if (nums<0){
            
                neg++;
                
            }
            
        }
        
        if(neg!=0){
            
            System.out.println("Ha leído al menos un número negativo.");
                
        }else{
                
                System.out.println("No ha leído negativos.");
                
            }
    }
    
}
