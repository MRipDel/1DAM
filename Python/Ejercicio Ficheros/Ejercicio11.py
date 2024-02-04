# Manuel Ripalda Delgado
# Escribe un programa en python que lea el fichero gazpacho.json con datos su origen e ingredientes, a continuación deberá  crear otro fichero primerapellido_ingredientes.json con los todos los datos de sus ingredientes.

import json

with open("gazpacho.json","r") as json_ripalda:

    gazpacho_ripalda=json.load(json_ripalda)

json_ripalda.close()

for clave_ripalda, valor_ripalda in gazpacho_ripalda.items():

    print(f"{clave_ripalda}: {valor_ripalda}")

with open("ripalda_ingredientes.json","w") as nuevo_json_ripalda:

    json.dump(gazpacho_ripalda["ingredientes"],nuevo_json_ripalda,indent=2)

nuevo_json_ripalda.close()