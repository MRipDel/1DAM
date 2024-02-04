/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_18_ud4;
import java.util.Scanner;
/**
 *
 * @author Manuel Ripalda
 */

/*.Escribe un programa que calcula el salario neto semanal de un trabajador en 
función del número de horas trabajadas y la tasa de impuestos de acuerdo a las 
siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.
 Escribir nombre, salario bruto, tasas y salario neto.
*/
public class Ej_18_UD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        
        int horTrabaj,horExtra,pagoHora;
        
        float salBruto,salNeto,rango500,rango900,rangoSup;
        
        Scanner pregunta=new Scanner(System.in);
        
        System.out.println("Indica tu nombre:");
        
        nombre=pregunta.nextLine();
        
        System.out.println("¿Cuántas horas  has trabajado?");
        
        horTrabaj=pregunta.nextInt();
        
        rango900= 0;
        
        rangoSup=0;
        if (horTrabaj>35){
            
            horExtra= horTrabaj-35;
        }else{
            horExtra=0;
        }
        
        System.out.println("¿A cuánto cobras la hora?");
        
        pagoHora= pregunta.nextInt();
        
        salBruto= horTrabaj*pagoHora+horExtra*pagoHora*1.5f;
        
        if(salBruto<=500){
            
            salNeto= salBruto;
            
        }
        else if(salBruto<=900) {
            
            rango500=500;
            
            salNeto=rango500+(salBruto-rango500)*0.75f;
        }
        else{
            
                rango500=500;
                
                rango900=400*0.75f;
                
                rangoSup=(salBruto-900)*0.55f;
                
                salNeto=rango500+rango900+rangoSup;
                
            }
        
        System.out.println("Nombre: "+nombre);
        
        System.out.println("Salario bruto: "+salBruto);
        
        System.out.println("Tasa del 45%: "+rangoSup);
        
        System.out.println("Tasa del 25%: "+rango900);

        System.out.println("Salario neto: "+salNeto);
    }
    
}
