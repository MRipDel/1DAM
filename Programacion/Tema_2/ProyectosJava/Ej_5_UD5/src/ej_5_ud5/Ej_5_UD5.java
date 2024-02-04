/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_5_ud5;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1*/
public class Ej_5_UD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        long factorial,num,num_ini;
        
        factorial=1;
        
        Scanner pregunta= new Scanner(System.in);
        
        System.out.println("Introduce el número del que quieras el factorial:");
       
        num_ini= pregunta.nextLong();
        
        for (num=num_ini; num > 1; num--) {

            factorial=factorial*num;
            
        }
        
        if(num_ini==0){
            
            factorial=1L;
        }
        
        System.out.println("El factorial de "+ num_ini + " es "
        + factorial);
        
    }
    
}
