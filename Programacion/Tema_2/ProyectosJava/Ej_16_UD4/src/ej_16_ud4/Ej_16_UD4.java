/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_16_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*16. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
calificación alfabética, escribiendo el resultado.
• de 0 a <3 Muy Deficiente.
• de 3 a <5 Insuficiente.
• de 5 a <6 Bien.
• de 6 a <9 Notable
• de 9 a 10 Sobresaliente*/
public class Ej_16_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float nota;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.println("Introduce tu nota del 0 al 10:");
        
        nota=pregunta.nextFloat();
        
        while (nota<0 || nota>10){
        
            System.out.println("Introduce tu nota del 0 al 10:");
        
            nota=pregunta.nextFloat();
            
        }
        
        if (nota<3){
            System.out.println("Muy deficiente.");
        }else if(nota>=3 && nota<5){
            System.out.println("Insuficiente.");
        }else if(nota>=5 && nota<6){
            System.out.println("Bien.");
        }else if(nota>=6 && nota<9){
            System.out.println("Notable.");
        }else{
            System.out.println("Sobresaliente.");
        }
        
        
    }
    
}
