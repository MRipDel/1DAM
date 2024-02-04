/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_6_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Escribe un programa que dado el precio de un artículo y el precio de venta 
real nos muestre el porcentaje de descuento realizado.*/
public class Ej_6_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double precioReal,precioArt, porcentaje ;
       
       Scanner pregunta= new Scanner(System.in);
       System.out.print("Introduce el precio real del producto: ");
       precioReal= pregunta.nextDouble();
       System.out.print("Introduce el precio artículo del producto: ");
       precioArt= pregunta.nextDouble();
       
       porcentaje= 100-(precioArt/precioReal)*100;
       
        System.out.print("El descuento aplicado a "+ precioReal+ " es del ");
       System.out.printf("%.2f",porcentaje);
        System.out.println("%");
       
        
    }
    
}
