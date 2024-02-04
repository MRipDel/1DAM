/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla.
*/
public class Ejercicio12Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a,b,total;
        
        Scanner pregunta=new Scanner(System.in);
        
        a=pregunta.nextInt();
        
        total=a;
        
        b=pregunta.nextInt();
        
        if(b==0){
            
            total=1;

        }else if(b==1){
        

        }
        
        for (int i = 1; i != b; i++) {

            total*=a;

        }
      
        System.out.println(total);
        
    } 
}
