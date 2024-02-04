#Manuel Ripalda Delgado
#Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

num1=int(input("Primer número: "))

num2=int(input("Segundo número: "))

suma=str(num1+num2)

resta1=str(num1-num2)

resta2=str(num2-num1)

division1=str(num1/num2)

division2=str(num2/num1)

multip=str(num1*num2)

num1=str(num1)

num2=str(num2)

print("La suma de " + num1 + " y " +num2 + " es: " + suma)

print("La resta de "+ num2 + " y " + num1+  " es: " + resta1)

print("La resta de "+ num1 + " y " + num2 + " es: " + resta2)

print("La división de "+ num1 + " entre " + num2 + " es: " + division1)

print("La división de "+ num2 + " entre " + num1 + " es: " + division2)

print("La multiplicación de "+ num1 + " por " + num2 + " es: " + multip)