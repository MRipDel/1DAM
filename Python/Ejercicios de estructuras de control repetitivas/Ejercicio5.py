#Manuel Ripalda Delgado
#Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.

vocales_ripalda=["a","e","i","o","u"]

espacio_ripalda=False

while espacio_ripalda==False:

    caracter_ripalda=input("Introduce un caracter:")

    if caracter_ripalda==" ":

        espacio_ripalda=True

    elif caracter_ripalda.lower() in vocales_ripalda:

        print("VOCAL")
    
    else:

        print("NO VOCAL")