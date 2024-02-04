#Manuel Ripalda Delgado
#Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

F=float(input("Introduce los grados en Farenheit a convertir: "))

C = (F-32)*5/9

print("Grados en Farenheit: " + str(F) +"\nGrados en Celsius: "+ str(round(C,2)))