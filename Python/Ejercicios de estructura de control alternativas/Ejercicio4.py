#Manuel Ripalda Delgado
#Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.

num1=float(input("Introduce el primer número:"))      #Se introduce el primer número. Se admiten decimales.

num2=float(input("Introduce el segundo número:"))     #Se introduce el segundo número. Se admiten decimales.

if num2!=0:                                           #Si num2 es distinto a 0, se realiza la división.

    div=num1/num2

else:                                                 #Si num2 es igual a 0, se muestra en consola un menaje de aviso.

    print("¡El segundo número es 0!")