/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio10libro704;
/**
 *
 * @author Manuel
 */
/*_____________________________Enunciado:_______________________________________
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario
*/
public class Ejercicio10libro704 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[]=new int[20],numPares=0,pares[],numImpares=0,impares[],contadorPares=0,contadorImpares=0;
        
        System.out.println("Vector original:");
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int)(Math.random()*101);
            
            if(vector[i]%2==0){
            
                numPares++;
                
            }else{
            
                numImpares++;               
            }
            System.out.print(vector[i]+"\t");
        }
        
        pares=new int[numPares];
                
        impares=new int[numImpares];
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2==0){
            
                pares[contadorPares]=vector[i];
                
                contadorPares++;
            }else{
            
                impares[contadorImpares]=vector[i];
                
                contadorImpares++;
            }
        }
        
        System.out.println("\nVector modificado: ");
        
        for (int i = 0; i < vector.length; i++) {
            
            if(i<numPares){
            
            vector[i]=pares[i];
                
            }else{
            
            vector[i]=impares[i-numPares];
            
            }
            System.out.print(vector[i]+"\t");
            
        }
        
    }                           
}