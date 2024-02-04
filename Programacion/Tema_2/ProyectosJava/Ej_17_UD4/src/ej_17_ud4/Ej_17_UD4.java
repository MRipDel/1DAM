/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_17_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */
/*Escribe un programa que recibe como datos de entrada una hora expresada en 
horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos 
que serán, transcurrido un segundo*/
public class Ej_17_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  hora,min,s,total;
        
        Scanner pregunta=new Scanner(System.in);
        
        do{
            System.out.println("Introduce una hora del 0 a 23: ");
            
            hora=pregunta.nextInt();
            
        }while(hora<0 || hora>23);
        
        do{
            
            System.out.println("Introduce los  minutos del 0 a 59: ");
            
            min=pregunta.nextInt();
            
        }while(min<0 || min>59);
        
        do{
            
            System.out.println("Introduce los segundos del 0 a 59: ");

            s=pregunta.nextInt();
        
        }while(s<0 || s>59);
        
        s++;
        
        if(s==60){
            
            s=00;
            
            min++;
            
            if(min==60){
                
                min=00;
                
                hora++;
                
                if(hora==24){
                    
                    hora=00;
                    
                }
            }
        }
        
        System.out.println("Son las " + hora + ":" + min + ":" +s);
    }
    
}
