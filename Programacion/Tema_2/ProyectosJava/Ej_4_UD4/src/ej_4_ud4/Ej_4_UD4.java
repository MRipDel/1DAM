
package ej_4_ud4;
import java.util.Scanner;
public class Ej_4_UD4 {

    public static void main(String[] args) {
        /*
        *Escribe un programa que lea dos números, calcule y muestre el 
        *valor de sus suma, resta, producto y división.
        */
        double num1,num2,suma,resta,producto,div;
       
        Scanner pregunta= new Scanner(System.in); 
       
        System.out.print("Introduce el primer número: ");
        
        num1= pregunta.nextInt();
        
        System.out.print("Introduce el segundo número: ");
       
        num2= pregunta.nextInt();
        
        suma= num1+num2;
        
        resta= num1-num2;
        
        producto= num1%num2;
        
        div=num1/num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: "+ suma);
        
        System.out.println("La resta de " + num2 + " a " + num1 + " es: "+ 
        resta);
        
        System.out.println("El producto de dividir "+num1+" entre "+num2+" es "+producto);
        
        System.out.print("La división de "+num1+" entre "+num2+" es: ");
        
        System.out.printf("%.2f",div);
                
        
    }
    
}
