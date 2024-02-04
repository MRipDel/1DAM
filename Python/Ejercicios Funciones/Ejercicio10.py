# Manuel Ripalda Delgado
# Escribir dos funciones que permitan calcular:

# La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
# La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
# Escribe un programa principal con un menú donde se pueda elegir la opción de convertir a segundos, convertir a horas,minutos y segundos o salir del programa.

from modules.FuncionEj10 import tiempoSegundos as seg
from modules.FuncionEj10 import tiempoHorMinSeg as hms

while True:

    opcion_ripalda=int(input("Seleccione una de las siguientes opciones:\n1. Convertir tiempo a segundos.\n2. Convertir tiempo a horas,minutos y segundos.\n3. Salir.\nSu elección: "))

    if opcion_ripalda==1:

        horas_ripalda=int(input("Introduzca las horas: "))
        minutos_ripalda=int(input("Introduzca los minutos: "))
        segundos_ripalda=int(input("Introduzca los segundos: "))
        print(f"Tiempo en segundos: {seg(horas_ripalda,minutos_ripalda,segundos_ripalda)}.")

    elif opcion_ripalda==2:

        segundos_ripalda=int(input("Introduzca el tiempo en segundos: "))

        hms(segundos_ripalda)
    
    elif opcion_ripalda==3:

        print("Ha decidido salir. Apagando el programa.")

        break
    else:

        print("Escoja una opción válida.")