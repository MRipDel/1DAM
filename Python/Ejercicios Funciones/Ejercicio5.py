# Manuel Ripalda Delgado
# Crea una función “calcularMaxMin” que recibe una lista con valores numéricos y devuelve el valor máximo y el mínimo. Crea un programa que pida números por teclado y muestre el máximo y el mínimo, utilizando la función anterior.

from modules.FuncionEj5 import calcular_max_min as maxMin

numeros_ripalda=[]

for i in range(1,6):  # Se piden 5 números como muestra, ya que no se especifica cuántos pedir.

    numeros_ripalda.append(int(input(f"Número {i}: ")))


maxMin(numeros_ripalda)