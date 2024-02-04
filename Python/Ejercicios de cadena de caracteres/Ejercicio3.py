#Manuel Ripalda Delgado
#Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.

cadena_ripalda=input("Introduce una cadena:")

#Para comprobar que la longitud de la cadena caracter_ripalda sea 1, se anida la solicitud de la variable y su comprobación en un bucle.

while True:

    caracter_ripalda=input("Introduce un caracter:")

    if len(caracter_ripalda)==1:

        break

    else:

        print("Debe ser un solo caracter.")

#Se imprime el resultado y se comprueba el número de veces que aparece la variable caracter_ripalda en cadena_ripalda mediante el método count().

print(caracter_ripalda,"aparece en",cadena_ripalda,"el siguiente número de veces:",cadena_ripalda.count(caracter_ripalda))
