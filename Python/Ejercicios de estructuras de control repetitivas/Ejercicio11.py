#Manuel Ripalda Delgado
#Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
#sólo es divisible entre él mismo y la unidad. Nota: Es suficiente probar hasta la raíz cuadrada del número para 
#ver si es divisible por algún otro número.
import math

factor_ripalda=2

num_ripalda=int(input("Introduce un número:"))

for i_ripalda in range(int(math.sqrt(num_ripalda)),num_ripalda):

    if num_ripalda%i_ripalda==0 and i_ripalda!=1:

        factor_ripalda+=1

if factor_ripalda>2:

    print("No es primo.")

else:

    print("Es primo.")