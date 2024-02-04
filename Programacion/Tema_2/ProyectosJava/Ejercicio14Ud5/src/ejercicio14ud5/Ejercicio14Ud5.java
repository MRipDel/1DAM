/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

 /*
Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
5, que aunque sume 145 € no es el mínimo número de billetes posible).
*/

public class Ejercicio14Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cantidad,b500,b200,b100,b50,b20,b10,b5;                              //Se declaran las variables enteras
        Scanner pregunta=new Scanner(System.in);                          //Se crea el objeto de la clase Scanner 
        
        
        b500=0;
        
        b200=0;
                                                                                //Se definen los valores iniciales de los billetes   
        b100=0;
        
        b50=0;
        
        b20=0;
        
        b10=0;
        
        b5=0;
        
        System.out.print("Introduce una cantidad de euros que sea múltiplo "
        + "de 5: ");
        
        cantidad=pregunta.nextInt();                                            //Expresado en euros
        
        if (cantidad>=500){
        
            b500=cantidad/500;

            cantidad%=500;
        }
        
        if(cantidad>=200){
            
            b200=cantidad/200;

            cantidad%=200;
        }        
        if(cantidad>=100){
                
            b100=cantidad/100;

            cantidad%=100;
        }            
        if(cantidad>=50){
                
            b50=cantidad/50;

            cantidad%=50;
        }                
        if(cantidad>=20){

             b20=cantidad/20;

             cantidad%=20;
        }                     
        if(cantidad>=10){

            b10=cantidad/10;

            cantidad%=10;
        }                         
        if(cantidad==5){

           b5=1;
        }                         
        
        System.out.println("Tus billetes son:\n De 500: "+ b500+";\nDe 200: "+b200+
                ";\nDe 100: "+b100+"; \nDe 50: "+b50+";\nDe 20: "+b20+";\nDe 10: "+
                b10+";\nDe 5: "+b5);
        
    }
    
}
