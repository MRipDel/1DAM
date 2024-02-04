/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio18_ud5;

/**
 *
 * @author Manuel Ripalda
 */
/* Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
naturales.
*/
public class Ejercicio18_Ud5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sumaCuadrados, num;
        
        sumaCuadrados=0;
        
        for (num = 1; num <= 5; num++) {
            
            sumaCuadrados+=Math.pow(num, 2);
            
        }
        System.out.println("La suma de los cuadrados de los 5 primeros "
                + "números naturales es "+sumaCuadrados);
    }
}
