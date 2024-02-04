/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso_cuentacorriente;
/**
 *
 * @author Manuel Ripalda Delgado
 */
public class CuentaCorriente {

    //   Variables de instancia
    private final String NUM_CUENTA;                
    private double saldo;
    
    //  Constructores de clase
    public CuentaCorriente(){
        NUM_CUENTA=CuentaCorriente.generarNumCuenta();
        saldo=0;
    }
    
    public CuentaCorriente(double saldo){
        NUM_CUENTA=CuentaCorriente.generarNumCuenta();
        this.saldo=saldo;
    }
    
    //  Métodos de instancia
    
    public void ingreso(int ingreso ){
        saldo+=ingreso;
    }
    
    public void cargo(int gastos){
         saldo-=gastos;
    }
    
    public static void transferencia(CuentaCorriente c,CuentaCorriente c2, int ingreso){    
        c2.saldo+=ingreso;
        c.saldo-=ingreso;
    }
    
    //  Métodos de clase
    public void imprimirCuenta(){
        System.out.println("Número de cta: "+NUM_CUENTA+". Saldo: "+saldo+"€");
    }
    
    //  Método auxiliar de clase
    private static String generarNumCuenta(){
        String numero="";
        
        for (int i = 0; i < 10; i++) {
            
            numero+=Integer.toString((int)(Math.random()*10));
        }
        return numero;
    }
  
}
