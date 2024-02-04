# Manuel Ripalda Delgado

# Escribe un programa en python que lea el fichero json pedidos.json con datos de ordenes, a continuación deberá crear otro fichero primerapellido_clientes.json con los todos los datos de los clientes.

import json

with open("pedidos.json","r") as json_ripalda:

    pedidos_ripalda=json.load(json_ripalda)

json_ripalda.close()

clientes_ripalda=[]         # El nodo raíz de un JSON puede ser un mapa o una secuencia

with open("ripalda_clientes.json","w")as nuevo_json_ripalda:

    for pedido_ripalda in pedidos_ripalda["ordenes"]:

        clientes_ripalda.append(pedido_ripalda["cliente"])

    json.dump(clientes_ripalda,nuevo_json_ripalda,indent=2)

nuevo_json_ripalda.close()