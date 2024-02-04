
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package caso_cuentacorriente;
import java.util.Scanner;
        
/*
  @author Manuel Ripalda Delgado
                                     ENUNCIADO
Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número
de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se
pide llevar un registro de los movimientos realizados.

                                    EXPLICACIÓN
Los objetos tienen 2 propiedades: un número de cuenta, que siempre es el mismo una vez generado,
y un saldo. Además, tienen dos constructores, uno por defecto en el cual se le asigna un saldo
de 0, y otro en el que se le inserta el valor. En ambos constructores se les da un número de cuenta
mediante un método auxiliar de clase, en el cual se van concatenando números aleatorios hasta 
alcanzar los 10 dígitos.

Hay otro método de clase {imprimirCuenta()} el cual muestra los datos de la cuenta bancaria 
que se le pase por  parámetro. Hay 3 métodos de instancia, todos void puesto que la intención 
no es volcar los datos en ningún lado, sino ejecutar instrucciones y ya. Estos métodos son los 
siguientes:

- ingreso(): se le pasa un doble como parámetro y se lo suma al saldo del objeto.
- cargo(): se le pasa un doble como parámetro y se lo resta al saldo del objeto.
- transferencia(): se le pasa un objeto y un doble como parámetros y el funcionamiento es el siguiente:
    · Se le resta el entero del parámetro al saldo del objeto que llama al método.
    · Se le suma el entero del parametro al saldo del objeto que llama al método.
 */
public class Caso_CuentaCorriente {

    public static void main(String[] args) {
        
    CuentaCorriente cuenta1 = new CuentaCorriente();
    CuentaCorriente cuenta2 = new CuentaCorriente(1500);
    CuentaCorriente cuenta3 = new CuentaCorriente(6000);
    
    cuenta1.imprimirCuenta();
    cuenta2.imprimirCuenta();
    cuenta3.imprimirCuenta();
    
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    CuentaCorriente.transferencia(cuenta2,cuenta3, 100);
        System.out.println("");
    cuenta1.imprimirCuenta();
    cuenta2.imprimirCuenta();
    cuenta3.imprimirCuenta();
    }

}
