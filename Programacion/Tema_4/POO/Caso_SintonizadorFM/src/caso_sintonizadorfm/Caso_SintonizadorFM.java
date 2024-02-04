/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package caso_sintonizadorfm;

/**
 *
 * @author Manuel Ripalda Delgado
 */
/*_________________________________ENUNCIADO____________________________________
Definir una clase que permita controlar un sintonizador digital de emisoras FM:
concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
(down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un
momento dado (display). Supondremos que el rango de frecuencias para manejar oscila
entre los 80 MHz y los 108MHz y que, al inicio, el controlador sintonice la frecuencia
indicada en el constructor o 80 MHz por defecto. Si durante una operación de subida o
bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la
del extremo contrario. Escribir un pequeño programa principal para probar su
funcionamiento.

*/
public class Caso_SintonizadorFM {

    public static void main(String[] args) {
     
        Sintonizador s1=new Sintonizador();
        Sintonizador s2=new Sintonizador(98);
        
        System.out.println("Frecuencia de s1:"+s1.display());
        System.out.println("Frecuencia de s2:"+s2.display());

        
        s1.down();
        
        for (int i = 0; i < 3; i++) {
            s2.up();
        }
        
        System.out.println("Frecuencia de s1:"+s1.display());
        System.out.println("Frecuencia de s2:"+s2.display());
        
    }

}
