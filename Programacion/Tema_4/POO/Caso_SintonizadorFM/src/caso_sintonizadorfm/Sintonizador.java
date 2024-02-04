/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_sintonizadorfm;

/**
 *
 * @author usuario
 */
public class Sintonizador {
    
    //variable de clase
    public static final double SALTO=0.5; 
    private static final int FRECMIN=80;
    private static final int FRECMAX=108;
    
    //variable de instancia
    private double frecuencia;
    
    //Constructores
    public Sintonizador(){
        frecuencia=FRECMIN;
    }
    public Sintonizador(double frecuencia){
        this.frecuencia=frecuencia;
    }
    //Métodos de instancia 
    public double up(){
        
        if(frecuencia==FRECMAX){
            frecuencia=FRECMIN;
        }else{
            frecuencia+=SALTO;
        }
        return frecuencia;
    }
    
    public double down(){
        
        if(frecuencia==FRECMIN){
            frecuencia=FRECMAX;
        }else{
            frecuencia-=SALTO;
        }
        return frecuencia;
    }
    
    public String display(){
        
        return Double.toString(frecuencia);
    }
    
}
