#Manuel Ripalda Delgado
#Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido. Ejemplo, si se introduce 23 que muestre 32.


while True:                                                             #Con este Do-While se fuerza a introducir 1 número de dos cifras.
    numero=int(input("Introduce un número de dos cifras: ")[::-1])      #El [::-1] es hacer slicing con paso inverso, de modo que te devuelve del último caracter al primero de la cadena. 
    if len(str(numero))==2:
        break

print(numero)