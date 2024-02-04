#Manuel Ripalda Delgado
#Crea una aplicación que pida un número y calcule su factorial (El factorial de un
#número es el producto de todos los enteros entre 1 y el propio número y se 
#representa por el número seguido de un signo de exclamación.

factorial_ripalda=int(input("Introduce un número:"))    #Se pide un número en consola

for i in range(1,factorial_ripalda):

    factorial_ripalda*=i

if factorial_ripalda==0:

    print(1)

else:

    print(factorial_ripalda)