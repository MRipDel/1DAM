
package ej_5_ud4;

import java.util.Scanner;

public class Ej_5_UD4 {


    public static void main(String[] args) {
        /*
        *Escribe un programa que toma como dato de entrada un número que 
        *corresponde a la longitud de un radio y nos escribe la longitud de la
        *circunferencia, el área del círculo y el volumen de la esfera que
        *corresponden con dicho radio
        */
        int lado;  
        
        Scanner pregunta= new Scanner(System.in);
    
        System.out.print("Introduce un lado: ");
    
        lado= pregunta.nextInt();
        
        System.out.print("");
        
        System.out.printf("%.2f",Math.pow(lado,2)*Math.PI);
    }
    
}
