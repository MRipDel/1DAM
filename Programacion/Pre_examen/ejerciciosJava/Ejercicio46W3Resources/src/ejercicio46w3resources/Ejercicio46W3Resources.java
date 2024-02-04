/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio46w3resources;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
//Link: https://www.w3resource.com/java-exercises/string/index.php
/*Write a Java program to reverse every word in a string using methods.*/
public class Ejercicio46W3Resources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String cadena,palabras[],cadenaInvertida="";
        
        char palabrasInvertidas[][];
        
        System.out.println("Introduce una cadena:");
        
        cadena=sc.nextLine();
        
        cadena=cadena.strip();
        
        palabras=cadena.split(" +");
        
        palabrasInvertidas= new char[palabras.length][];
        
        for (int i = 0; i < palabras.length; i++) {
            
            palabrasInvertidas[i]=palabras[i].toCharArray();
            
        }
        
        for (int i = 0; i < palabrasInvertidas.length; i++) {
            
            for (int j =palabrasInvertidas[i].length-1 ; j >= 0; j--) {
                
                cadenaInvertida+=palabrasInvertidas[i][j];
                
            }
            if(i<palabrasInvertidas.length-1){
            
                cadenaInvertida+=" ";
            }     
        }

        
        
        System.out.println(cadenaInvertida);
    }

}
