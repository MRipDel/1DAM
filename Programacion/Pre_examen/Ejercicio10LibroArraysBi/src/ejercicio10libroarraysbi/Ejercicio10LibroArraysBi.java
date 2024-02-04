/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10libroarraysbi;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Manuel
 */
/*________________________________Enunciado:____________________________________
Realiza el juego de las tres en raya.
*/
public class Ejercicio10LibroArraysBi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String tablero[][]=new String[3][3],figura="";
        
        for (int i = 0; i < tablero.length; i++) {
            
            Arrays.fill(tablero[i],".");
            
        }
        
        do{
            
            System.out.println("¿Qué figura quieres? X/O");

            figura=sc.nextLine();

            if("X".equals(figura.toUpperCase())||"O".equals(figura.toUpperCase())){

                System.out.println("");

            }

        }while("X".equals(figura.toUpperCase())||"O".equals(figura.toUpperCase()));
        
    }
}
