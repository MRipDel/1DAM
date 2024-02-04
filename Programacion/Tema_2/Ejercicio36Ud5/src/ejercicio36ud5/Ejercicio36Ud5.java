/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio36ud5;

//Se importan los métodos necesarios para el programa. No se emplea import java.util.*; porque de este modo es más eficiente.

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*/
public class Ejercicio36Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Se crea un objeto de la clase Scanner y se declaran las variables.
        
        Scanner pregunta=new Scanner(System.in);
        
        int altura, numEspVertical,numEspIzquierda;
        
        String ast,espIzquierda,espVertical;
        
        boolean repetir;
        
        //Se definen los valores iniciales de la variables excepto la de la altura, la cual se pedirá por consola.
        
        ast="*";
        
        espIzquierda="  ";
        
        espVertical="   ";
        
        altura=0;
        
        numEspVertical=3;
        
        numEspIzquierda=2;
        
        /*Se fuerza al usuario a introducir un número entero sin que pueda provovar una excepción que bloquee el programa.
        Además, si el número es menor a 3, se muestra un mensaje de error y vuelve a preguntar.*/
        
        do{
            repetir=true;
            
            try{
                System.out.print("Introduce la altura de la X: ");
        
                altura=pregunta.nextInt();
            }
            catch(InputMismatchException e){
                
                pregunta.nextLine();
             
            }
            if (altura<3 || altura%2==0){
        
                System.out.println("Error: la altura debe ser un número impar y por lo menos 3.");
            
            }else{
            
                repetir=false;
                
            }
            
        }while(repetir);
        
        /*Este bucle sirve para hallar el número de espacios que contiene el eje vertical, tanto por arriba como por abajo ya que se usará la misma variable para imprimir los caracteres, aunque
        una distinta para el rango del método substring() que se usa en las líneas 98, 117 y 119. */
        
        for (int i = 1; i < altura/2; i++) {
            
            espVertical+="    ";
            
            numEspVertical+=4;
            
            numEspIzquierda+=2;
            
        }
        
        //Esta parte del código es la destinada a imprimir la X. En primer lugar, se muestra la primera línea de los asteriscos puesto que en el ejemplo comienza sin ningún espacio a la izquierda.
        
        System.out.println(ast+espVertical+ast);
        
        //El bucle for comienza en 1 porque ya se ha mostrado la primera línea de la X; además, puesto que el bucle sirve para mostrar la parte superior de la X, el bucle debe acabar en la altura/2.
        
        for (int i = 1; i < altura/2; i++) {
            
            numEspVertical-=4;
            
            espVertical=espVertical.substring(0,numEspVertical);
            
            System.out.println(espIzquierda+ast+espVertical+ast);
            
            espIzquierda+="  ";
            
        }

        //Se imprime el asterisco situado en el centro de la X.
       
        System.out.println(espIzquierda+ast);
        
        //El siguiente bucle for es para mostrar la parte inferior de la X. Se aplican las mismas normas para el bucle que en el anterior, pero las instrucciones cambian.
        
        for (int i = 1; i < altura/2; i++) {
            
            
            numEspIzquierda-=2;
            
            espVertical=espVertical.substring(0,numEspVertical);
            
            espIzquierda=espIzquierda.substring(0,numEspIzquierda);
            
            System.out.println(espIzquierda+ast+espVertical+ast);
            
            espVertical+="    ";
            
            numEspVertical+=4;
            
        }

        System.out.println(ast+espVertical+ast);

    } 
}