/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package numcifras;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
/*Programa donde introduces un número y te dice las cifras que tiene.*/
public class NumCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        int num,cero, cifra=0; //num es el número que pedimos, cero es una variable que se usará hasta que quede a 0 par sacar el n de cifras, cifra es el contador.
        
        System.out.println("Introduce un número: ");
        
        num=sc.nextInt();
        
        cero=num;
        
        do{
        
            if(cero>=0){ 
            
                cero/=10;
                
                cifra++;
                
            }
            
        }while(cero!=0);
        
        System.out.println(num+" tiene "+cifra+" cifras.");
        
    }

}
