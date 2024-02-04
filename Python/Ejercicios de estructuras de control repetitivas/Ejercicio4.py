#Manuel Ripalda Delgado
#Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

cantidad=range(int(input("¿Cuántos números quieres introducir?: ")))

positivos=0

negativos=0

ceros=0

for i in cantidad:

    num=int(input())

    if num>0:

        positivos+=1

    elif num<0:

        negativos+=1

    elif num==0:

        ceros+=1

print("Numeros mayores a 0:",positivos,"\nNúmeros menores a 0:",negativos,"\nNúmeros iguales a 0:", ceros)