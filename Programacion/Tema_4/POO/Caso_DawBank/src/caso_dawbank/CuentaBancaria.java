/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_dawbank;
/**
 *
 * @author Manuel Ripalda Delgado
 */
public class CuentaBancaria {
    private final String IBAN;
    private final String TITULAR; 
    private double saldo=0;
    private double movimientos[]=new double[100];
    private final static int limiteInferior=-50;
    private final static int limiteSuperior=3000;
    private int numMovimientos=0;
    //Método constructor.
    public CuentaBancaria(String titular, String iban, double saldo, double movimientos[]){
        this.TITULAR=titular;
        this.IBAN=iban;
        this.saldo=saldo;
        this.movimientos=movimientos;
    }
    //Setters y getters.
    public double getSaldo(){
        return saldo; 
    }
    public double[] getMovimientos() {
        
        return movimientos;
    }
    public String getIBAN() {
        return IBAN;
    }

    public String getTITULAR() {
        return TITULAR;
    }
    
    public int getNumMovimientos(){
    
        return numMovimientos;
    }
    
    
}
