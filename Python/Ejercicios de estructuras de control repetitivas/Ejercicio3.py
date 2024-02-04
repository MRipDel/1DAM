#Manuel Ripalda Delgado
#Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.

cero_ripalda=False

suma_ripalda=0

contador_ripalda=0

while cero_ripalda==False:

    num_ripalda=int(input("Introduce un número:"))

    suma_ripalda+=num_ripalda

    if num_ripalda==0:

        cero_ripalda=True
    else:
        contador_ripalda+=1

media_ripalda=suma_ripalda/contador_ripalda

print("La suma de los números es", suma_ripalda,"\nLa media de los números es","%1.2f"%media_ripalda)



#https://stackoverflow.com/questions/455612/limiting-floats-to-two-decimal-points