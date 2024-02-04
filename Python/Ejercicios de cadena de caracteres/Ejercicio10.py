#Manuel Ripalda Delgado
#Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.

cadena_ripalda=input("Introduce una cadena:")

cadena_invertida_ripalda=cadena_ripalda[::-1]

#Se comparan las cadenas en minúscula porque mayúsculas y minúsculas no tienen el mismo valor Unicode, pero sí pueden ser la misma letra. Mostrar el caracter con la primera letra en mayúscula es un detalle de presentación.

if cadena_ripalda.lower()==cadena_invertida_ripalda.lower():

    print(cadena_ripalda.capitalize(),"es un palíndromo.")

else:

    print(cadena_ripalda.capitalize(),"no es un palíndromo.")