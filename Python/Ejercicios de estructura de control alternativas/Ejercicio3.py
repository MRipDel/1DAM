#Manuel Ripalda Delgado
#Escribe un programa que lea un número e indique si es par o impar.

num=int(input("Introduce un número:"))     #Se introduce un número por consola.

if num%2==0:                               #Se aplica la condición de que si el resto de la división de num entre 2 es igual a 0, es verdadero, y por lo tanto, num es par.

    print(num,"es par.")

else:                                      #Si la condición no es verdadera, solo puede ser falso, por ello es una estructura de control condicional simple.

    print(num,"es impar.")