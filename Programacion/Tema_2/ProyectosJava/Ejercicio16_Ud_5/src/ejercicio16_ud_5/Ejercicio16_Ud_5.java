/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_ud_5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
*/
public class Ejercicio16_Ud_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner pregunta=new Scanner(System.in);                          //Se declara el objeto Scanner.
        
        int num,div;                                                            //Se declaran las variables enteras.
        
        div=0;                                                                  //Se define el valor de los divisores en 0.
        
        System.out.println("Introduce un número y comprueba si es primo o no:");    
        
        num=pregunta.nextInt();                                                 //Se pregunta el número del que averiguar si es primo o no.
        
        for (int i=1;i<=num;i++){                                               //Se realiza un bucle que termina cuando la variable "i" es igual al número preguntado. 
        
            if(num%i==0){                                                       //Si el resto de la división entre "num" e "i" es 0, es que "i" es un divisor.
                
                div++;                                                          //Contador de divisor aumenta en 1.
            }
        }
        
        if(div>2){                                                              //Si num tiene más de dos divisores es que no es primo.
        
            System.out.println("No es primo.");
        }else{
        
            System.out.println("Es primo.");
            
        }
        
    }
    
}
