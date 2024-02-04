#Manuel Ripalda Delgado
#Crea una tabla (lista con dos dimensiones) de 5x5 enteros. Carga la tabla con valores numéricos enteros. Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

import random

tabla_ripalda=[[],[],[],[],[]]

#El contador tiene una doble función: contar el nº de filas y columnas y servir como eje x a la hora de iterar la tablas para hallar las sumas de las columnas.
contador_ripalda=0      

#Se genera una tabla con valores aleatorios del 1 al 5 en cada fila.
for fila_ripalda in tabla_ripalda:      

    for i_ripalda in range(5):

        valor_ripalda=int((random.random()*5)+1)

        fila_ripalda.append(valor_ripalda)

#Para mayor aclaración durante la ejecución, se imprime la lista generada automáticamente.
print("La lista generada es la siguiente:\n")

for fila_ripalda in tabla_ripalda:

    for valor_ripalda in fila_ripalda:

        print(valor_ripalda, end=" ")

    print()

print() #Espacio para más claridad en la consola.

#A continuación, se suman y se muestran las filas y las columnas:
for fila_ripalda in tabla_ripalda:

    contador_ripalda+=1

    suma_columnas_ripalda=0

    #Las filas se suman con la función sum().
    suma_filas_ripalda=sum(fila_ripalda)
    
    print(f"La suma de la fila nº{contador_ripalda} es {suma_filas_ripalda}",end=", ")

    #Las columnas se suman iterando la variable tablas.
    for i_ripalda in range(5):

        suma_columnas_ripalda+=tabla_ripalda[i_ripalda][contador_ripalda-1]

    print(f"y la suma de la columna nº{contador_ripalda} es {suma_columnas_ripalda}.")