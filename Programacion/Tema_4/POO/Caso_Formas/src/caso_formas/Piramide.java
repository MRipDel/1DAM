/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso_formas;

/**
 *
 * @author Manuel Ripalda Delgado
 */
public class Piramide {
    
//  Constante de instancia
    private final String FORMA;
    
//  Variable de clase.
    private static int piramidesCreadas=0;
    
//  Método constructor. 
    public Piramide(int altura){
        FORMA=crearPiramide(altura);
        piramidesCreadas++;
    }
    
    private String crearPiramide( int altura){
        String piramide="";
        
            for (int i = 0; i < altura; i++) {
                
                for (int j = 0; j < altura*2; j++) {
                    
                    if(j>=altura-i && j<=altura+i){
                        
                        piramide+="*";
                        
                    }else{
                        
                        piramide+=" ";
                            
                    }
                }
                piramide+="\n";
            }
        return piramide;
    }
    
//  Getters.
    public static int getPiramidesCreadas(){
        return piramidesCreadas;
    }

    public String getForma() {
        return FORMA;
    }  
}
