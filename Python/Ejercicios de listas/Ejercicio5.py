#Manuel Ripalda Delgado
#Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y posterior ordene los elementos de menor a mayor.

import random

lista_ripalda=[]

#Se genera una lista con 10 valores aleatorios.
for i_ripalda in range(10):

    lista_ripalda.append(random.random())

#Se ordenan, y a pesar de que no lo pide el ejercicio, a modo de comprobación, se muestra la lista por consola.
lista_ripalda.sort()

print(lista_ripalda)