#Manuel Ripalda Delgado
#Realizar un algoritmo para determinar cuánto ahorrará una persona en un año, si al final de cada mes deposita cantidades variables de dinero; además, se quiere saber cuánto lleva ahorrado cada mes.

meses_ripalda=["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"]

ahorrado_total_ripalda=0

for i_ripalda in meses_ripalda:

    ahorrado_mensual_ripalda=float(input("Ahorrado en "+i_ripalda+":"))

    ahorrado_total_ripalda+=ahorrado_mensual_ripalda

    print("Ahorros totales en"+i_ripalda+":",ahorrado_total_ripalda,"\n")


  


