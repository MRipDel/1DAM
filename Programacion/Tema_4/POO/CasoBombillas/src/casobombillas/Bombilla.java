/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casobombillas;

/**
 *
 * @author usuario
 */
public class Bombilla {
    
    private boolean interruptor;
    public static boolean interruptorGeneral;
    
    //Método constructor
    public Bombilla(boolean interruptor){
        this.interruptor=interruptor;
    }
    //Setter

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }
    //Método
    public String imprimirEstado(){
        
        String estado;
        if(interruptor==true && interruptorGeneral==true){
        
            estado="encendida";
        }else{
        
            estado="apagada";
        }
        return estado;
    }
    
}
