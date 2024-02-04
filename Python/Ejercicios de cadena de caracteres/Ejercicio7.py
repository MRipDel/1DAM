#Manuel Ripalda Delgado
#Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.

cadena_ripalda=input("Introduce una cadena:")

#Se comprueba que la primera variable caracter es un solo caracter y que se encuentra en la variable cadena_ripalda.

while True:

    caracter1_ripalda=input("Introduce un solo caracter que se encuentre en la cadena:")

    if len(caracter1_ripalda)==1 and caracter1_ripalda in cadena_ripalda:

        break

#Se comprueba que la segunda variable caracter es de un solo caracter y que no es igual al caracter a sustituir.

while True:

    caracter2_ripalda=input("Introduce un solo caracter para sustituir el caracter anterior:")

    if len(caracter2_ripalda)==1 and caracter2_ripalda!=caracter1_ripalda:

        break

    elif caracter2_ripalda==caracter1_ripalda:

        print("Procura que no sea el mismo caracter que el que se quiere sustituir...")

#Se reemplaza el caracter con el método replace().

cadena_ripalda=cadena_ripalda.replace(caracter1_ripalda,caracter2_ripalda)

print(cadena_ripalda)
