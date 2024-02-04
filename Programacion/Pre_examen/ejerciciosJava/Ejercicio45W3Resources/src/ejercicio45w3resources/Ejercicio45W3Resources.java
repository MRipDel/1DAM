/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio45w3resources;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
//Link: https://www.w3resource.com/java-exercises/string/index.php
/* Write a Java program to reverse words in a given string*/
public class Ejercicio45W3Resources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String cadena,palabras[],cadenaInvertida="";
        
        System.out.println("Introduce una cadena:");
        
        cadena=sc.nextLine();
        
        cadena=cadena.strip();
        
        palabras=cadena.split(" ");
        
        for (int i = palabras.length-1; i >= 0; i--) {
            cadenaInvertida+=palabras[i];
            
            if(i>0){
            
                cadenaInvertida+=" ";
                
            }
        }
        
        System.out.println(cadenaInvertida);
    }

}
