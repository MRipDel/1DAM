/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
public class Ejercicio13Ud5 {

    /**
     * @param args the command line arguments
     */
    /*Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
    adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
    usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).*/
    public static void main(String[] args) {

        int min,max,num,intentos;
           
        String respuesta;        
        
        boolean acierto=false;
        
        Scanner pregunta=new Scanner(System.in);
        
        intentos=0;
        
        min=0;
        
        max=101;
        
        System.out.println("Piensa en un número del 1 al 100.");
        
        while (acierto==false){
            
            num=(max+min)/2;
            
            intentos++;
            
            if (num>=1){
                
                System.out.println("¿Es "+num+" tu número? Indica = + o -:");

                respuesta=pregunta.next();
                
                switch(respuesta){

                    case "=":

                        acierto=true;

                        System.out.println("¡Acerté! Me ha costado "+intentos+" intentos.");

                        break;

                    case "+":

                        min=num;

                        break;

                    case "-":

                        max=num;

                        break;

                    default:
                        
                       intentos--;
                }
            }else{
                
                min++;
      
            }
                    

        }  
    } 
}
