#Manuel Ripalda Delgado
#Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.

num1=float(input("Introduce el primer número:"))      #Se introduce el primer número. Se admiten decimales.

num2=float(input("Introduce el segundo número:"))     #Se introduce el segundo número. Se admiten decimales.

if num1>num2:                                       #Si el primer número es mayor que el segundo, se hace lo siguiente.

    print(num1, "es mayor que",num2)

else:                                               #Si el primer número es igual o menos que el segundo, se hace lo siguiente.

    print(num1,"no es mayor que",num2)
    