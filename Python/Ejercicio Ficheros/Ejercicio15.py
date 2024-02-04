# Manuel Ripalda Delgado
# Escribe un programa en python que lea el fichero json libreria.json con datos de nuestra librería, recibe por teclado un límite inferior y superior para el precio y muestre en la terminal todos los libros cuyo precio esta en ese intervalo.

import json

with open("libreria.json","r") as json_ripalda:

    libreria_ripalda=json.load(json_ripalda)

json_ripalda.close()

minimo_ripalda=float(input("Establece un precio mínimo para los libros:"))

maximo_ripalda=float(input("Establece un precio máximo para los libros:"))

for libro_ripalda in libreria_ripalda["bookstore"]["book"]:

    if float(libro_ripalda["price"])>=minimo_ripalda and float(libro_ripalda["price"])<=maximo_ripalda:

        print(libro_ripalda)