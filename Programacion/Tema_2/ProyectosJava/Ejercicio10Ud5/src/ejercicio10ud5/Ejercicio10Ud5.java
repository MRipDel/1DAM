/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10ud5;

import  java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.*/

public class Ejercicio10Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //Se declaran las variables.
        int nota;
        
        boolean diez=false;
        
        Scanner pregunta=new Scanner(System.in);
        
    //Se aplica un bucle do-while que parará cuando se  introduzca el valor -1 por consola.
    
        do{
        
            System.out.print("Introduce una nota: ");

            nota=pregunta.nextInt();
    
    //Si en algún momento se acumula un 10 en la variable nota, la variable diez pasará a ser true.
    
            if (nota==10){

                diez=true;

            }
        }while (nota!=-1);
     
    //Condicional que imprime distintas cosas en función de si ha habido un 10 en la secuencia de notas o no.
    
        if (diez==true){
        
            System.out.println("Se ha introducido al menos un 10.");
            
        }else{
        
            System.out.println("No se ha introducido ningún 10.");
            
        }
    }
}
