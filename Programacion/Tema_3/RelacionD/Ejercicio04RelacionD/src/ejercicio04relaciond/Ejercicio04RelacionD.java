/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio04relaciond;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*_________________________Enunciado:___________________________________________
Crea un algoritmo que pida 5 palabras por teclado y que al final nos muestre la 
de mayor y menor longitud. Si coinciden dos o más palabras con la mayor o menor 
longitud, entonces se mostrará la primera que se introdujo.
*/
public class Ejercicio04RelacionD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 

        String palabras[]=new String[5],minLong="",maxLong="";
       
        System.out.println("introduce 5 palabras: ");
        
        for (int i = 0; i < palabras.length; i++) {
            
            System.out.print("Palabra nº"+(i+1)+":");
            
            palabras[i]=sc.next();
            
            if(i==0){
            
                minLong=palabras[i];
                
                maxLong=palabras[i];

            }else{ 
                
                if(palabras[i].length()<minLong.length()){
            
                    minLong=palabras[i];
            
                }else if(palabras[i].length()>maxLong.length()){
                
                    maxLong=palabras[i];
                    
                }  
            }
        }
        
        System.out.println("La palabra de mayor longitud es "+maxLong);
        System.out.println("La palabra de menor longitud es "+minLong);
        
    }
}
