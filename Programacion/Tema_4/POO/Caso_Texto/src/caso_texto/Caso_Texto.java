/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package caso_texto;

/*
  @author Manuel Ripalda Delgado
                                     ENUNCIADO
Diseñar la clase TEXTO que gestiona una cadena de caracteres con algunas
características:
● La cadena de caracteres tendrá una longitud máxima que se especifica en el
constructor.
● Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
longitud máxima, es decir, exista espacio disponible.
● Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
cuando no se rebase el tamaño máximo establecido.
● Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
● Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la
fecha y la hora de la última modificación efectuada. Usar las clases
java.time.LocalDate y java.time.LocalDateTime mediante las correspondientes
sentencias de importación.
● Deberá existir un método que muestre la información que gestiona cada texto.
 */
public class Caso_Texto {

    public static void main(String[] args) {
        Texto t1=new Texto(20);
        
        
        t1.añadirCadena(" tope de mango", 1);
        t1.añadirChar('A',2);
        t1.mostrarInfo();
        
        
    }
    
    
}
