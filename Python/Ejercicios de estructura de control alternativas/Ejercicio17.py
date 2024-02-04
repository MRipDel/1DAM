#Manuel Ripalda Delgado
#Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.

#Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
#Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.

cara=int(input("Número del dado:")) #Se pide el resultado de lanzar un dado.

if cara>=1 and cara<=6:             #Se crea una estructura de control donde si en la variable cara se introduce un número del 1 al 6, procede con el programa, si no, muestra un mensaje de error.

    cara_opuesta=7-cara             #Puesto que la suma de las caras opuestas de un dado siempre suman 7, al restarle el valor de la variable cara a 7, da el valor de la cara opuesta.

    if cara_opuesta==1:             #Una condicional para mostrar un número en texto según el resultado de la variable cara_opuesta.

        print("Uno.")

    elif cara_opuesta==2:

        print("Dos.")

    elif cara_opuesta==3:

        print("Tres.")

    elif cara_opuesta==4:

        print("Cuatro.")

    elif cara_opuesta==5:

        print("Cinco.")

    elif cara_opuesta==6:       #Podría haberse usado un else porque el único valor posible restante era un 6, pero se ha escrito un elif para mayor claridad. 
        print("Seis.")
else:

    print("ERROR: número incorrecto.")