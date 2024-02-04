#Manuel Ripalda Delgado
#Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).

vector_ripalda=[]

num_ripalda=0

#Bucle para llenar la lista hasta introducir un número negativo.
while num_ripalda>=0:

    num_ripalda=float(input("Introduce un número: "))

    if num_ripalda>=0:

        vector_ripalda.append(num_ripalda)

#Se muestran los valores  en la lista.

print("Los números de la lista son:")

for i_ripalda in vector_ripalda:

    print(i_ripalda,end=" ")

    #He querido quitarle el salto de línea por presentación. He sacado la información de aquí: https://es.stackoverflow.com/questions/525728/c%C3%B3mo-quitar-el-salto-de-l%C3%ADnea-en-pantalla-al-hacer-un-print-dentro-de-un-for-in