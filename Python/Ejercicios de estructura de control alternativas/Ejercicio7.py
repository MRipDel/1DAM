#Manuel Ripalda Delgado
#Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
#El exponente sea positivo, sólo tienes que imprimir la potencia.
#El exponente sea 0, el resultado es 1.
#El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

import math         #Se importa el módulo math para usar funciones incluídas en el mismo.

base=int(input("Introduce la base:"))           #Se introduce el valor de la base y se trasforma a entero.

exp=int(input("Introduce el exponente:"))       #Se introduce el valor del exponente y se transforma a entero.

if exp>0:                                       #Si el exponente es positivo, se calcula la potencia y se muestra en consola.

    pot=math.pow(base,exp)                      

    print(int(pot))

elif exp==0:                                    #Si el exponente es igual a 0, se le da el valor de 1 a la potencia y se muestra en consola.

    pot=1

    print(pot)
else:                                           #Si el exponente es negativo, se muestra en consola una cadena mostrando el resultado en forma de fracción que da una potencia cuando el exponente es negativo. 

    print("1 /",int(math.pow(base,abs(exp))))
