/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso_texto;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Manuel Ripalda Delgado
 */
public class Texto {

    //  Variables de instancia
    public String cadena="";
    private final int LONGITUD;
    private final LocalDate FECHA_CREACION;
    private LocalDate fecUltMod;
    private LocalDateTime horUltMod;
    
    //  Constructor
    public Texto(int longitud){
        LONGITUD=longitud;
        FECHA_CREACION=LocalDate.now();
        fecUltMod=LocalDate.now();
        horUltMod=LocalDateTime.now();
    }
    
    //  Métodos
    public String añadirChar(char caracter, int posicion){
    
        if (cadena.length()<LONGITUD){
            
            if(posicion==1){
                cadena+=caracter;
            }else if(posicion==2){
                cadena=caracter+cadena;
            }
            fecUltMod=LocalDate.now();
            horUltMod=LocalDateTime.now();
            
        }else{
        
            System.err.println("ERROR. La cadena ha llegado a su límite de caracteres.");
        }
        
        return cadena;
    }// finAñadirChar()


    public String añadirCadena(String cadena, int posicion){
    
            
        if (cadena.length()+this.cadena.length()<=LONGITUD){
            
           
            if(posicion==1){
                this.cadena+=cadena;  
            }else if(posicion==2){
                this.cadena=cadena+this.cadena;
            }
            fecUltMod=LocalDate.now();
            horUltMod=LocalDateTime.now();
            
        }else{
            System.err.println("ERROR. La cadena ha llegado a su límite de caracteres.");
        }
        
        return cadena;
    }// finAñadirCadena()
        
    public void contarVocales(){
        
        int contador=0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)=='a'|cadena.charAt(i)=='A'||cadena.charAt(i)=='e'||cadena.charAt(i)=='E'||cadena.charAt(i)=='i'||cadena.charAt(i)=='I'||cadena.charAt(i)=='o'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'||cadena.charAt(i)=='U'){
                contador++;   
            }
        }
        System.out.println("Hay "+contador+" vocales en "+cadena);
    }// finContarVocales()
    
    public void mostrarInfo(){
        
        System.out.println("\nCadena: "+cadena);
        System.out.println("Número de caracteres de la cadena: "+cadena.length());
        System.out.println("Caracteres máximos de la cadena: "+LONGITUD);
        contarVocales();
        System.out.println("Fecha de creación: "+FECHA_CREACION);
        System.out.println("Fecha y hora de la última modificación: "+fecUltMod+", "+horUltMod.getHour()+":"+horUltMod.getMinute()+":"+horUltMod.getSecond());
    }
        
}
