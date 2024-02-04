#Manuel Ripalda Delgado
#Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.

lista1_ripalda=[]

lista2_ripalda=[]

lista3_ripalda=[]

#Se realiza un bucle donde se piden los valores de las dos primeras listas y se suman en una tercera. 
for i_ripalda  in range(5):

    lista1_ripalda.append(int(input("Introduce un valor entero para la primera lista:")))

    lista2_ripalda.append(int(input("Introduce un valor entero para la segunda lista:")))

    lista3_ripalda.append(lista1_ripalda[i_ripalda]+lista2_ripalda[i_ripalda])

#Para comprobar que ha funcionado, se muestra la tercera lista.
print(lista3_ripalda)