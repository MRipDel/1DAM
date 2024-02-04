/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cuadradomagico;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Manuel
 */
public class CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int cuadrado[][]=new int[4][4],sumaColumna,sumaFila=0, filaPrevia=0;
        
        boolean repetir,magico=true;
        
        System.out.println("Introduce los números del cuadrado para formar un cuadrado mágico: ");
        
        for (int i = 0; i < cuadrado.length; i++) {                             //Bucle para rellenar el cuadrado y comprobar las filas.
            
            sumaFila=0;
            
            for (int j = 0; j < cuadrado[i].length; j++) {
                
                System.out.print("Fila "+(i+1)+", columna "+(j+1)+": ");     
                
                do{
                    repetir=true;
                    
                    try{
                        
                        cuadrado[i][j]=sc.nextInt();
                        
                        repetir=false;
                        
                    }catch(InputMismatchException e){
                    
                        System.out.print("Introduce un número natural, por favor: ");
                        
                        sc.nextLine();
                    }
                }while(repetir); 
                
                sumaFila+=cuadrado[i][j];
            }
            
            
            if( i>0 && filaPrevia!=sumaFila){
            
                magico=false;
            
            }
            
            filaPrevia=sumaFila;
        }
        
        for (int i = 0; i < cuadrado.length; i++) {
            
            sumaColumna=0;
            
            for (int j = 0; j < cuadrado[i].length; j++) {
                
                System.out.print(cuadrado[i][j]+"\t");
                
                sumaColumna+=cuadrado[j][i];
            }
            
            System.out.println("\n");
            
            if(sumaColumna!=sumaFila){
            
                magico=false;
                
            }            
        }
        
        if(magico==false){
        
            System.out.println("\nNo es un cuadrado mágico.");
            
        }else if(magico==true){
        
            System.out.println("\nEs un cuadrado mágico.");
        
        }
    }
}
