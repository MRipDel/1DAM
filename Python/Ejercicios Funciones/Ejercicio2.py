# Manuel Ripalda Delgado
# Crea un programa que pida dos número enteros al usuario y diga si alguno de ellos es múltiplo del otro. Crea una función EsMultiplo que reciba los dos números, y devuelve si el primero es múltiplo del segundo.

from modules.FuncionEj2 import es_multiplo as multiplo

num1_ripalda=int(input("Introduce un número:"))

num2_ripalda=int(input("Introduce otro para comprobar si es su múltiplo o no:"))

multiplo(num1_ripalda,num2_ripalda)