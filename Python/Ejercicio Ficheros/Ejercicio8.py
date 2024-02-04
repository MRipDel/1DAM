# Manuel Ripalda Delgado

# Escribe un programa en python que lea el fichero json colores.json con datos de colores, deberá mostrar en la terminal todos los nombres de colores, sus códigos rgba y hexadecimal respectivamente.

import json

# Se abre el archivo colores.json y se vuelca en una variable.
with open("colores.json","r") as json_ripalda:

    colores_ripalda=json.load(json_ripalda)

json_ripalda.close()

# Se itera el valor del mapa colors, el cual es una secuencia, para sacar los resultados.
for i_ripalda in colores_ripalda["colors"]:

    color_ripalda=i_ripalda["color"]

    rgba_ripalda=i_ripalda["code"]["rgba"]

    hex_ripalda=i_ripalda["code"]["hex"]

    print(f"Color:\t {color_ripalda}\nRGBA ->\t {rgba_ripalda}\nHEX->\t {hex_ripalda}\n")