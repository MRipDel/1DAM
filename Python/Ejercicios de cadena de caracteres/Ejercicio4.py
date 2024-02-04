#Manuel Ripalda Delgado
#Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

cadena_ripalda=input("Introduce una frase:")

contador_palabras_ripalda=0

#Se comprueba si hay espacios, y si los hay, se separa la cadena en múltiples cadenas dentro de una lista.

if " " in cadena_ripalda:

    cadena_ripalda=cadena_ripalda.split()

#Se considera palabra toda cadena que contenga exclusivamente los caracteres [a-z][A-Z], por ello se comprueba cadena por cadena de la lista con el método isalpha().

    for palabra_ripalda in cadena_ripalda:

        if palabra_ripalda.isalpha()==True:

            contador_palabras_ripalda+=1

    print("Hay",contador_palabras_ripalda,"palabras en la cadena.")

else:

    print("No es una frase.")

#Si se quisiera concretar aún más, se podrían añadir reglas como incluir una lista de palabras de un solo caracter y en la estructura condicional de la línea 18 incluir la lógica pertinente para que solo aceptase palabras de un caracter si estuvieran en dicha lista.