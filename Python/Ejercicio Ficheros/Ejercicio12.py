# Manuel Ripalda Delgado

# Escribe un programa en python que lea el fichero *movies.json con datos de películas. A continuación deberá crear un fichero primerapellido_pelicula1994.json con los títulos de las películas  que se hayan estrenado en 1994.

import json

with open("movies.json","r") as json_ripalda:

    peliculas_ripalda=json.load(json_ripalda)

json_ripalda.close()

listado_pelis_ripalda=[]

with open("ripalda_pelicula1994.json","w") as nuevo_json_ripalda:

    for pelicula_ripalda in peliculas_ripalda:

        if pelicula_ripalda["year"]=="1994":

            listado_pelis_ripalda.append(pelicula_ripalda)
        
    json.dump(listado_pelis_ripalda,nuevo_json_ripalda,indent=3)
    
nuevo_json_ripalda.close()