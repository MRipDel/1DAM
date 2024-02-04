/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej08libro704;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
/**
 *
 * @author Manuel
 */
/*_______________________________Enunciado:_____________________________________
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*/
public class Ej08Libro704 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        sc.useLocale(Locale.US);
        
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        double temperaturas[]=new double[12];
        
        boolean repetir;
        
        for (int i = 0; i < temperaturas.length; i++) {
            
            repetir=true;
            
            do{
                
                try{
                    
                    System.out.print("Temperatura media de "+meses[i].toLowerCase()+": ");
                    
                    temperaturas[i]=sc.nextDouble();
                    
                }catch(InputMismatchException e){
                    
                    System.out.println("La temperatura debe ser un número real (el decimal se expresa con un punto). ");
                    
                    sc.nextLine();
                    
                }
                    
                    if(temperaturas[i]!=0){ //El valor por defecto de una posición en un vector de números es 0.
                    
                        repetir=false;
                        
                    }
                
            }while(repetir);
            
        }
        
        for (int i = 0; i < temperaturas.length; i++) {
            
            System.out.print(meses[i].substring(0,3)+":\t| "+temperaturas[i]+"\tºC |-->\t");
            
            for (int j = 0; j < (int)temperaturas[i]; j++) {
                
                System.out.print("#");
                
            }
            if(temperaturas[i]%(int)temperaturas[i]!=0){
            
                System.out.print("/");
                
            }
            
            System.out.println("");
        } 
    }
}
