/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio19_ud5;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
/*Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
escribir un único asterisco.*/
public class Ejercicio19_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        
        String ast="*";
        
        Scanner pregunta=new Scanner(System.in);
        
        System.out.print("Introduce un número y te devuelvo ese número en asteriscos:");
        
        num=pregunta.nextInt();
        
       if (num<=0){                                                             //0 tampoco  es un número positivo, así que se incluye en el caso de que se tenga que imprimir un solo asterisco.
           
           System.out.println(ast);
           
       }else{
           
           for (int i = 1; i <= num; i++) {
               
               System.out.print(ast);
               
           }
       }   
    }
}