/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package caso_dawbank;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Manuel Ripalda Delgado
*/
public class DawBank {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        sc.useLocale(Locale.US);
        String iban;
        String titular;
        double movimientos[]=new double[100];
        CuentaBancaria cliente;
        
        titular=solicitarTitular();
        iban=solicitarIban();
        cliente=new CuentaBancaria(titular, iban, 0,movimientos);
        menu(cliente);
        
    }//main
    
    //Funciones de recogida de datos
    public static String solicitarTitular(){
        
        Scanner sc = new Scanner(System.in);
        String titular;
        System.out.println("Introduzca su nombre: ");
        titular=sc.nextLine();
        
        if(titular.matches("([A-Z][a-z]+ ?)+")==false){
            System.err.println("ERROR. El nombre debe estar correctamente introducido, con mayúsculas y minúsculas. ");
            solicitarTitular();
        }
        return titular; 
    }//solicitarTitular()
    
    public static String solicitarIban(){
        Scanner sc = new Scanner(System.in);
        String iban;
        int num;
        System.out.println("Introduzca su código de IBAN: ");
        iban=sc.nextLine();
        if(iban.matches("[A-Z][A-Z]")==false){
        
            System.err.println("ERROR. El código de IBAN debe estar compuesto por dos letras mayúsculas.");
            solicitarIban();
        }else{
            for (int i = 0; i < 22; i++) {

                num=(int)(Math.random()*10);

                iban+=Integer.toString(num);
            }        
        }
        return iban;
    }//solicitarIban()
    
    //Funciones de salidas de datos
    public static void mostrarCuenta(CuentaBancaria cliente){
    
        System.out.println("\nDatos de la cuenta:"
                +"\nTitular: "+cliente.getTITULAR()
                +"\nIBAN: "+cliente.getIBAN()
                +"\nSaldo: "+cliente.getSaldo()
                +"\nMovimientos: \n"+Arrays.toString(cliente.getMovimientos()));
    }
    
    
            

    public static double[] ingreso(CuentaBancaria cliente,double saldo){
        
        Scanner sc=new Scanner(System.in);
        int numMovimientos=cliente.getNumMovimientos();
        double movimientos[]=cliente.getMovimientos();
        
        if(numMovimientos<movimientos.length){
                
            movimientos[numMovimientos]=sc.nextDouble();
            
            
        }else{}
        return 
        
    }//ingreso()
    
    //Función del menú
    public static void menu( CuentaBancaria cliente){
        
        Scanner sc = new Scanner(System.in);
        int opcion; 
        
        System.out.print("Bienvenido a Daw Bank. Seleccione una de las siguientes opciones:\n"
                + "1. Mostrar datos de la cuenta.\n"
                + "2. Mostrar el IBAN de la cuenta.\n"
                + "3. Mostrar el titular de la cuenta.\n"
                + "4. Mostrar el saldo disponible.\n"
                + "5. Ingresar dinero.\n"
                + "6. Retirar dinero.\n"
                + "7. Mostrar historial de movimientos.\n"
                + "8. Salir del menú.\n"
                + "Su elección: ");
        
        opcion=sc.nextInt();
        
        switch(opcion){
        
            case 1:
                
                mostrarCuenta(cliente);
                menu(cliente);
                break;
            case 2:
                
                System.out.println("\nEl IBAN de la cuenta es: "+cliente.getIBAN());
                menu(cliente);
                break;
                
            case 3:
                System.out.println("\nEl titular de la cuenta es: "+cliente.getTITULAR());
                menu(cliente);
                break;
                
            case 4:
                System.out.println("\nEl saldo de la cuenta es:"+cliente.getSaldo());
                menu(cliente);
                break;
                
            case 5:
                
                ingreso(cliente, cliente.getSaldo());
                menu(cliente);
                break;
                
            case 6:
                
                menu(cliente);
                break;
                
            case 7:
                
                menu(cliente);
                break;
                
            case 8:
                
                System.out.println("Que tenga un buen día.");
                break;
            
            default:
                
                System.err.println("ERROR. Introduzca una de las opciones disponibles, por favor.");
                menu(cliente);
                break;
        }
    }//menu()
}
