#Manuel Ripalda Delgado
#Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
#A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
#La suma de los números que están dentro del intervalo (intervalo abierto).
#Cuantos números están fuera del intervalo.
#Informa si hemos introducido algún número igual a los límites del intervalo.

suma_intervalo_ripalda=0

limite_intervalo_ripalda=False

fuera_intervalo_ripalda=0

lista_ripalda=[int(input("Límite inferior:")),int(input("Límite superior:"))]

if lista_ripalda[1]<=lista_ripalda[0]:

    while lista_ripalda[1]<=lista_ripalda[0]:

        lista_ripalda[1]=int(input("Límite superior:"))

intervalo_ripalda=range(lista_ripalda[0]+1,lista_ripalda[1])

while True:

    num_ripalda=int(input("Introduce un número:"))

    if num_ripalda==0:

        break
    
    elif num_ripalda in intervalo_ripalda:

        suma_intervalo_ripalda+=num_ripalda
    
    elif num_ripalda==lista_ripalda[0] or num_ripalda==lista_ripalda[1]:

        limite_intervalo_ripalda=True
    
    elif num_ripalda not in intervalo_ripalda:

        fuera_intervalo_ripalda+=1

print("La suma de los números dentro del intervalo es "+str(suma_intervalo_ripalda)+".\nHay",fuera_intervalo_ripalda,"fuera del intervalo.")

if limite_intervalo_ripalda==True:

    print("Se ha introducido algún número igual a los límites del intervalo.")

else:

    print("No se ha introducido algún número igual a los límites del intervalo.")


