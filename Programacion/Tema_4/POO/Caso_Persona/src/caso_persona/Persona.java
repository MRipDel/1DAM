/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso_persona;

/**
 *
 * @author Manuel Ripalda Delgado
 */
public class Persona {
    
//  Variables de instancia.
    private String nombre="";
    private int edad=0;
    private final String dni;
    private final char sexo;
    private double peso=0;
    private double altura=0;
    
//  Métodos constructores.
    public Persona(){
        sexo='H';
        dni=generarDni();
    }
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=Persona.comprobarSexo(sexo);
        dni=generarDni();
    }
    
    public Persona(String nombre, int edad, char sexo, String dni, double peso,double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=Persona.comprobarSexo(sexo);
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;
    }

//  Setters.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//  Métodos.
    
    public int calcularIMC(){
        
        int imc;
        
        imc=(int)(peso/(Math.pow(altura,2)));
        
        if(imc<20){
            imc=-1;
        }else if(imc>=20 && imc<25){
            imc=0;
        }else{
            imc=1;
        }
        return imc;
    }// Fin calcularImc().
    
    public boolean esMayorDeEdad(){
        
        boolean mayor;
                
        if(edad<18){
            mayor=false;
        }else{
            mayor=true;
        }
        return mayor;
    }// Fin esMayorDeEdad().
    
    private static char comprobarSexo(char sexo){

        if(sexo!='H' || sexo!='M'){
            sexo='H';    
        }
        return sexo;
    }// Fin comprobarSexo().
    
    private static String generarDni(){
        
        String dni="";
        int numeros=(int)(Math.random()*Math.pow(10,8));
        char letra[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        dni+=Integer.toString(numeros)+letra[(numeros%23)];
        
        return dni;        
    }//  Fin generarDni().
}
