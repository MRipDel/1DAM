/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio08arraysbilibro;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Manuel
 */
/*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.*/
public class Ejercicio08ArraysBiLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int alfilFila,alfilColumna;
        
        String tablero[][]={
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"},
                {"a","b","c","d","e","f","g","h"}
        };
        
        String posicion;
        
        System.out.print("Di la posición del alfil: ");
        
        posicion=sc.nextLine();
               
        }
        
    }

}
