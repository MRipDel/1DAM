/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio06relaciond;
import java.util.Scanner;

/**
 *
 * @author Manuel Ripalda
 */
/*_____________________________Enunciado:_______________________________________
Escribir un programa que pida el nombre completo al usuario y lo muestre sin 
vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Jesús Pérez" se 
mostrará "Jss Prz".
*/
public class Ejercicio06RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new  Scanner(System.in);

        String nombre="";
            
        System.out.print("Introduce tu nombre completo: ");

        nombre=sc.nextLine();
        
        nombre=nombre.trim();
        
        for (int i = 0; i < nombre.length(); i++) {
            
            if(nombre.charAt(i)!='a'&& nombre.charAt(i)!='A'&& nombre.charAt(i)!='e'&& nombre.charAt(i)!='E'&& nombre.charAt(i)!='i'&& nombre.charAt(i)!='I'&& nombre.charAt(i)!='o'&& nombre.charAt(i)!='O' && nombre.charAt(i)!='u'&& nombre.charAt(i)!='U'){
            
                System.out.print(nombre.charAt(i));
                
            }
            
        }
        
    }

}
