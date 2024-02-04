#Manuel Ripalda Delgado
#Escribir por pantalla cada carácter de una cadena introducida por teclado.

cadena_ripalda=input("Introduce una cadena:")

#Se genera un entero según la longitud de la candena con la función len() para luego recorrer un rango en el que se imprime caracter por caracter.

caracteres_ripalda=len(cadena_ripalda)

for i_ripalda in range(caracteres_ripalda):

    print(cadena_ripalda[i_ripalda])
    
