/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio05relaciond;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
/*_______________________Enunciado:_____________________________________________
Crea un programa que lea por teclado una cadena de caracteres e indique la 
cantidad de palabras que tiene. De la clase String, sólo se pueden utilizar los 
métodos length(), charAt() y trim().
*/
public class Ejercicio05RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String palabras;
        
        int numPalabras=1;
        
        System.out.print("Introduce las palabras que quieras: ");
        
        palabras=sc.nextLine();
        
        palabras=palabras.trim();
        
        for (int i = 0; i < palabras.length(); i++) {         
            
            if(i<palabras.length()-1){
                
                if(palabras.charAt(i)==' '&& palabras.charAt(i+1)!=' '){

                        numPalabras++;
                        
                }
            }
                            
        }
        System.out.println(palabras+" contiene "+ numPalabras+" palabras.");
    }

}
