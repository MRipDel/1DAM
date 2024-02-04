/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package casobombillas;

/**
 *
 * @author Manuel Ripalda Delgado
 */
/*_________________________________ENUNCIADO____________________________________
Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o
apagar individualmente. Para ello, hacer una clase BOMBILLA con una variable privada que
indique si está encendida o apagada, así como un método que nos diga el estado de una
bombilla concreta. Además, queremos poner un interruptor general , de forma que si este se
apaga, todas las bombillas quedan apagadas. Cuando el interruptor general se activa, las
bombillas vuelven a estar encendidas o apagadas, según estuvieran antes. Cada bombilla
se enciende y se apaga individualmente, pero sólo responde que esté encendida si su
interruptor particular está activado y además hay luz general.

*/
public class CasoBombillas {

    public static void main(String[] args) {
        //Se crean los objetos de la clase Bombilla
        Bombilla b1,b2,b3;
        b1=new Bombilla(false);
        b2=new Bombilla(true);
        b3=new Bombilla(false);
        //
        Bombilla.interruptorGeneral=false;
        
        System.out.println("b1 está "+b1.imprimirEstado());
        System.out.println("b2 está "+b2.imprimirEstado());
        System.out.println("b3 está "+b3.imprimirEstado());
        
        System.out.println("\nEncendiendo interruptor general...");
        Bombilla.interruptorGeneral=true;
        
        System.out.println("b1 está "+b1.imprimirEstado());
        System.out.println("b2 está "+b2.imprimirEstado());
        System.out.println("b3 está "+b3.imprimirEstado());
        
        
        System.out.println("\nEncendiendo bombillas apagadas...");
        b1.setInterruptor(true);
        b3.setInterruptor(true);
        
        System.out.println("b1 está "+b1.imprimirEstado());
        System.out.println("b2 está "+b2.imprimirEstado());
        System.out.println("b3 está "+b3.imprimirEstado());
        
        System.out.println("\nApagando interruptor general...");
        Bombilla.interruptorGeneral=false;
        
        System.out.println("b1 está "+b1.imprimirEstado());
        System.out.println("b2 está "+b2.imprimirEstado());
        System.out.println("b3 está "+b3.imprimirEstado());
    }

}
