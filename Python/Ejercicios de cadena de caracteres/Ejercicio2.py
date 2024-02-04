#Manuel Ripalda Delgado
#Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.

#Se introducen los datos por teclado

cadena_ripalda=input("Introduce una cadena: ")

subcadena_ripalda=input("Ahora introduce una subcadena: ")

#Se comprueba si cadena_ripalda comienza por subcadena_ripalda con el método startswith().

if cadena_ripalda.startswith(subcadena_ripalda)==True:

    print(cadena_ripalda,"empieza por",subcadena_ripalda)

else:

    print(cadena_ripalda,"no empieza por",subcadena_ripalda)