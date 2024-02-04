#Manuel Ripalda Delgado
#Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
#Python3 no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede calcular?

import math

numero=float(input("Introduce un número y recibirás su raíz cuadrada y su raíz cúbica:"))

rCuadrada=math.sqrt(numero)

rCubica=math.cbrt(numero)

print(rCuadrada,", ",rCubica)