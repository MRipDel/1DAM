#Manuel Ripalda Delgado
#Crea una aplicación que permita adivinar un número. La aplicación genera
#un número aleatorio del 1 al 100. A continuación va pidiendo números y va
#respondiendo si el número a adivinar es mayor o menor que el introducido,
#además de los intentos que te quedan (tienes 10 intentos para acertarlo).
#El programa termina cuando se acierta el número (además te dice en cuantos
#intentos lo has acertado), si se llega al limite de intentos te muestra el
#número que había generado.

import random                                                                   #Para generar  un número aleatorio es necesario la librería random.

aleatorio_ripalda=random.randint(1,100)                                         #Se genera un número aleatorio entero en el rango 1 y 100.

acierto_ripalda=False                                                           #Variable         

contador_ripalda=1

comprobante_ripalda=False

while acierto_ripalda==False and contador_ripalda<10:                                        #Bucle en el que se sale cuando se acierta el número o se sobrepasa el número de intentos.   

    while comprobante_ripalda==False:                                                        #Se anida un bucle en el que se comprueba que el número aportado está entre 1 y 100.

        respuesta_ripalda=int(input("Mete un valor entre 1 y 100:"))

        if respuesta_ripalda>=1 and respuesta_ripalda<=100:

            comprobante_ripalda=True

    if respuesta_ripalda==aleatorio_ripalda :

        acierto_ripalda=True

        if contador_ripalda==1:

            print("¡Ganaste, lo has acertado en un solo intento!")

        else:

            print("¡Ganaste! Lo has acertado en", contador_ripalda,"intentos.")

    elif respuesta_ripalda<aleatorio_ripalda:

        print("Es mayor. Llevas ", contador_ripalda,"intentos.")

    elif respuesta_ripalda>aleatorio_ripalda:

        print("Es menor. Llevas ", contador_ripalda,"intentos.")

    comprobante_ripalda=False

    contador_ripalda+=1

if contador_ripalda==10:

    print("¡Perdiste!")