/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package caso_formas;

/*
  @author Manuel Ripalda Delgado
                                     ENUNCIADO
Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe
saber su altura y sobre un rectángulo se debe saber tanto la base como la
altura. Cada una de las clases debe tener un atributo de clase (static) que
lleve la cuenta de las pirámides y de los rectángulos creados respectivamente.
El siguiente código que va dentro del main genera la salida que se indica.
                                    EXPLICACIÓN
Hay dos clases, una por cada forma, y el comportamiento es similar. En la clase
pirámide, se pide tan solo la altura como parámetro en el método constructor,
mientras que en la clase rectángulo sae piden por parámetro del constructor tanto
la anchura como la altura del mismo.

Ambas clases tienen un contador de formas declarado como variable de clase privada
(getPiramidesCreadas() y getRectangulosCreados()),que van sumando 1 a medida que
se crean los objetos puesto que se encuentran en los constructores de sus respectivas
clases. Cada clase tiene, también, una constante de instancia de tipo String llamada forma.
 */
public class Caso_Formas {

    public static void main(String[] args) {
        
    Piramide p = new Piramide(4);
    Rectangulo r1 = new Rectangulo(4, 3);
    Rectangulo r2 = new Rectangulo(6, 2);
    
    System.out.println(p.getForma());
    System.out.println(r1.getForma());
    System.out.println(r2.getForma());
    System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
    }
}
