/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package piramidenumeros;

import java.util.Scanner;

/**
 *
 * @author Manuel Ripalda
 */
/*Crea una pirámide con números.*/

public class PiramideNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner pregunta=new Scanner(System.in);
        
        int pisos,num;
        
        String espacio=" ",hueco=" ",ast="*";
        
        
         
        System.out.println("¿De cuántos pisos quieres la pirámide hueca?");
        
        pisos=pregunta.nextInt();
        
        for (int i=0;i<pisos;i++){                                              //Para determinar el número de espacios que hay que mostrar inicialmente.

            espacio+=" ";                                                       //Da el número de espacios que se imprimen en primer lugar.
            
        }

        System.out.println(espacio+ast);
        
        for (int i = 0; i < pisos-2; i++) {
            
            System.out.println(espacio.substring(i,pisos)+ast+
                    hueco+ast);

        }
        
        
    }

}
