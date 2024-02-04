#Manuel Ripalda Delgado
#Pide al usuario dos números y muestra la “distancia” entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

import  math
#He usado la función math.dist() porque devuelve un valor absoluto equivalente a dos valores que le introduzcas.
num1=[int(input("Primer número:"))]
num2=[int(input("Segundo número:"))]

diferencia=math.dist(num1,num2)

print(diferencia)