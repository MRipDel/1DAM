#Manuel Ripalda Delgado
#Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es
#bisiesto si es un número divisible por 4, pero no si es divisible por 100, 
#excepto que también sea divisible por 400.

anio=int(input("Introduce un año:"))

bisiesto=False

if anio<400 and anio%4==0 and not anio%100==0:          #Si es menor a 400 no se le puede aplicar la regla de divisible entre 400.

    print("Es bisiesto")

elif anio%4==0 and (not anio%100==0 or anio%400==0):    #Si es mayor a 400, se le aplica toda la lógica mencionada en el enunciado.
  
    print("Es bisiesto.")

else:                                                   #Si no se cumple ninguna de las condiciones anteriores, es que no es un año bisiesto.

    print("No es bisiesto.")