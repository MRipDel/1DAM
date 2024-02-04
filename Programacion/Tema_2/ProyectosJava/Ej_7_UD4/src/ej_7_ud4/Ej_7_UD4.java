/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_7_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Escribe un programa que lea un valor correspondiente a una distancia en millas
marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
*/
public class Ej_7_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double millas,metros;
        
        Scanner  pregunta= new Scanner(System.in);
        
        System.out.println("Introduce una distancia en millas marinas:");
        
        millas=pregunta.nextDouble();
        
        metros=millas*1852;
        
        System.out.print("La distancia " + millas + " es " +metros + " en metros.");

        
        
        
        
    }
    
}
