# Manuel Ripalda Delgado
# El fichero calificaciones.csv contiene las calificaciones de un curso. Durante el curso se realizaron dos exámenes parciales de teoría y un examen de prácticas. Los alumnos que tuvieron menos de 4 en alguno de estos exámenes pudieron repetirlo al final del curso (convocatoria ordinaria). Realiza un programa que haga lo siguiente:

# Reciba el fichero de calificaciones.csv y devuelva una lista de listas, donde cada lista contiene la información de los exámenes y la asistencia de un alumno. Para ordenar la lista vamos a utilizar una función lambda:

#                     ordenados = sorted(csv_reader,key=lambda x:x[0])

# La función sorted recibe como parámetros la lista que deseas ordenar y el parámetro key es una función que le indica a sorted como debe ordenar, en este caso lambda x: x[0] le dice a sorted que como todos los elementos de la lista son listas escoja para comparar el primer valor de cada lista. Quizás es extraño ver lambda en el código pero es una abreviatura para funciones, si tienes dudas puede consultar documentaciones oficiales.

# Se deberá mostrar la lista ordenada en pantalla.

import csv

fichero_ripalda=open("calificaciones.csv","r")      

ordenados_ripalda=[]                                

calificacion_ripalda=fichero_ripalda.readlines()

# Estructura donde se rellena la lista bidimensional con los datos requeridos.
for alumno_ripalda in calificacion_ripalda:

    valores_alumno_ripalda=[]

    if not alumno_ripalda==calificacion_ripalda[0]:     # La primera lista no se recoge puesto que no se pide ya que son los parámetros, no valores de ningún alumno.

        alumno_ripalda=alumno_ripalda.split(";")        # Se crea una lista con el método split() de donde se irán almacenando los valores interesantes gracias a la condicional de la línea 31.

        for valor_ripalda in alumno_ripalda:

            if valor_ripalda!=alumno_ripalda[0] and valor_ripalda!=alumno_ripalda[1] and valor_ripalda!="" and valor_ripalda!="\n":

                valores_alumno_ripalda.append(valor_ripalda.strip("\n"))

        ordenados_ripalda.append(valores_alumno_ripalda)

# Cuando se acaba de usar el fichero, se cierra.
fichero_ripalda.close()

ordenados_ripalda=sorted(ordenados_ripalda,key=lambda ordenados_ripalda:int(ordenados_ripalda[0].strip("%")),reverse=True)  # Se ordena según el porcentaje de asistencia en orden descencente.

# Bucle para mostrar las listas ordenadas
for lista_ripalda in ordenados_ripalda:

    print(lista_ripalda)