/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio22_ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que pida un número y construya por pantalla su pirámide.
*/
public class Ejercicio22_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner pregunta=new Scanner(System.in);
        
        int pisos,espacio;
        
        String ast="*";
        
        String esp=" ";
        
        System.out.println("¿De cuántos pisos quieres la pirámide?");
        
        pisos=pregunta.nextInt();
        
        for (int i=0;i<pisos;i++){                                              //Para determinar el número de espacios que hay que mostrar inicialmente.

            esp=esp+" ";                                                        //Da el número de espacios que se imprimen en primer lugar.

        }

        for (espacio= esp.length(); espacio > 1; espacio--) {                   //Se define el valor del número de caracteres con el método length() y se crea un bucle con ese número.
            
            System.out.println(esp+ast);                                        //Se imprimen las variables "esp" y  "ast"
            
            ast+="**";                                                          //Se añaden dos asteriscos a la cadena ast.
            
            esp=esp.substring(1,espacio);                       //Se cambia el valor de la cadena "esp" con el método substring(), el cual sirve para seleccionar un fragmento de la cadena de caracteres. Varía el valor según la variable "espacio". 
            
        }
                    
    }

}
