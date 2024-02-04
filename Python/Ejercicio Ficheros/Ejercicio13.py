# Manuel Ripalda Delgado
# Escribe un programa en python que lea el fichero *movies.json con datos de películas. A continuación deberá crear un fichero primerapellido_peliculasaventuras.json con los títulos de las películas cuyo género incluya aventura.

# *hay algunos títulos de películas que vienen con una mala codificación, no afectará a la resolución del ejercicio.

import json

with open("movies.json","r") as json_ripalda:

    peliculas_ripalda=json.load(json_ripalda)

json_ripalda.close()

listado_pelis_ripalda=[]

with open("ripalda_peliculasaventura.json","w") as nuevo_json_ripalda:

    for pelicula_ripalda in peliculas_ripalda:

        if "Adventure" in pelicula_ripalda["genres"]:

            listado_pelis_ripalda.append(pelicula_ripalda["title"])
        
    json.dump(listado_pelis_ripalda,nuevo_json_ripalda,indent=3)
    
nuevo_json_ripalda.close()