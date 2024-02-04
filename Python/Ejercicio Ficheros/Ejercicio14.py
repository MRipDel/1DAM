# Manuel Ripalda Delgado
# Escribe un programa en python que lea el fichero json libreria.json con datos de nuestra librería y muestre en la terminal cuántos libros hay en la librería.

import json

with open("libreria.json","r") as json_ripalda:

    libreria_ripalda=json.load(json_ripalda)

json_ripalda.close()

libros_ripalda=len(libreria_ripalda["bookstore"]["book"])

print(f"Hay {libros_ripalda} libros.")