#Manuel Ripalda Delgado
#Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su cubo.

import random
import math

lista_ripalda=[]

#Se genera la lista con un bucle for recorriendo un rango de 10  e insertando un valor aleatorio entre 1 y 10.

for i_ripalda in range(10):

    lista_ripalda.append(int(random.random()*10)+1)

#Se recorre la lista para imprimir cada valor con sus respectivas operaciones.

for j_ripalda in lista_ripalda:

    cuadrado_ripalda=math.pow(j_ripalda,2)

    cubo_ripalda=math.pow(j_ripalda,3)

    print("De",str(j_ripalda)+":\nEl cuadrado es:",str(int(cuadrado_ripalda))+".\nEl cubo es:",int(cubo_ripalda))