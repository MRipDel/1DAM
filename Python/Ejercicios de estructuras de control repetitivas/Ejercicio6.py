#Manuel Ripalda Delgado
#Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
lista_ripalda=[int(input("Primer número:")),int(input("Segundo número:"))]

lista_ripalda.sort()

for i in range(lista_ripalda[0]+1,lista_ripalda[1]):    #Explicar el +1

    if i%2==0:

        print(i)