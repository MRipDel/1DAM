# Manuel Ripalda Delgado
# Crear una función que calcule el MCD de dos número por el método de Euclides. El método de Euclides es el siguiente:
# Se divide el número mayor entre el menor.
# Si la división es exacta, el divisor es el MCD.
# Si la división no es exacta, dividimos el divisor entre el resto obtenido y se continúa de esta forma hasta obtener una división exacta, siendo el último divisor el MCD.
# Crea un programa principal que lea dos números enteros y muestre el MCD.

from modules.FuncionEj9 import calcular_mcd as mcd

num1_ripalda=int(input("Escribe un número:"))

num2_ripalda=int(input("Escribe otro número:"))

print(f" El máximo común divisor entre {num1_ripalda} y {num2_ripalda} es {mcd(num1_ripalda,num2_ripalda)}.")