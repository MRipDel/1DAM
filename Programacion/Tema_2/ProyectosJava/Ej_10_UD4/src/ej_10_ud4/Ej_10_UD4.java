/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_10_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*. Escribe un programa que lee dos números, calcula y muestra el valor de su suma,
resta, producto y división. (Ten en cuenta la división por cero).*/
public class Ej_10_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1,num2,suma,resta,producto, div;
        
        Scanner pregunta= new Scanner(System.in); 
       
        System.out.print("Introduce el primer número: ");
        
        num1= pregunta.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
       
        num2= pregunta.nextDouble();
        
        suma= num1+num2;
        
        resta= num1-num2;
        
        producto= num1*num2;
        
        div=num1/num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: "+ suma);
        
        System.out.println("La resta de " + num2 + " a " + num1 + " es: "+ 
        resta);
        
        System.out.println("El resultado de multiplicar "+num1+" por "+num2+
        " es "+producto);
        
        
        
        if(num2==0){
            
            System.out.println("Intentaste dividir un número entre 0, pero "
            + "no me romperás. Te quedas sin división.");
            
        }else{
               System.out.print("La división de "+num1+" entre "+num2+" es: ");

               System.out.printf("%.2f",div);
            
             }

        
        
        
    }
    
}
