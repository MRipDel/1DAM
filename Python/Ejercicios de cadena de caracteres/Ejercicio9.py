#Manuel Ripalda Delgado
#Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.

cadena_ripalda=input("Introduce una cadena:")

subcadena_ripalda=input("Introduce una cadena para comprobar si está dentro de la primera:")

#Se comprueba con el operador de pertenencia in.

if subcadena_ripalda in cadena_ripalda:

    print(cadena_ripalda,"contiene",subcadena_ripalda)

else:

    print(cadena_ripalda,"no contiene",subcadena_ripalda)
