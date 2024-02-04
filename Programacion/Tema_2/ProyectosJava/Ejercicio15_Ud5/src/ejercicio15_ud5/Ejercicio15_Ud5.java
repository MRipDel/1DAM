/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
*/
public class Ejercicio15_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int mulTres,num;
        
        Scanner pregunta=new Scanner(System.in);
        
        mulTres=0;
        
        num=pregunta.nextInt();
        
        for (int i=1;i<=num;i++){
        
            if (i%3==0){
                
                mulTres++;
            }
        }
        
        System.out.println(num+" tiene "+mulTres+" múltiplos.");
    }  
}
