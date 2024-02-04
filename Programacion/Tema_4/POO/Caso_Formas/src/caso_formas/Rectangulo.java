/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso_formas;

/**
 *
 * @author Manuel Ripalda Delgado
 */
public class Rectangulo {

//  Constante de instancia.
    private final String FORMA;
    
//  Variable de clase.
    private static int rectangulosCreados=0;
    
//  Constructores.
    public Rectangulo(int ancho, int alto){
        
        FORMA=crearRectangulo(ancho,alto);
        rectangulosCreados++;
    }
    
//  Metodo estático.
    private static String crearRectangulo(int ancho, int alto){
    
        String rectangulo="";
        
        for (int i = 0; i < alto; i++) {
            
            for (int j = 0; j < ancho; j++) {
                
                    rectangulo+="*";
            }
            rectangulo+="\n";
        }
        return rectangulo;
    }     
    
//  Getters.
    public static int getRectangulosCreados(){
        return rectangulosCreados;
    }
    public String getForma() {
        return FORMA;
    }
}
