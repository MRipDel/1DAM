# Manuel Ripalda Delgado

# Escribe un programa en python que lea el fichero json pedidos.json con datos de órdenes, deberá mostrar en la terminal todos las órdenes de pedidos que no se hayan entregado.
import json

with open("pedidos.json","r") as json_ripalda:

    pedidos_ripalda=json.load(json_ripalda)

json_ripalda.close()

for pedido_ripalda in pedidos_ripalda["ordenes"]:

    if pedido_ripalda["delivery"]==False:           

        print(pedido_ripalda)

