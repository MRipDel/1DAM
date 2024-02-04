#Manuel Ripalda Delgado
#Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que está detrás
#viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus
#respectivas velocidades (km/h) y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.

d=float(input("¿A qué distancia se encuentran los coches A y B?:"))     #Expresado en km

v1=float(input("¿A cuánto va el coche de delante?:"))                  #Expresado en km/h

v2=float(input("¿A cuánto va el coche de detrás?:"))                   #Expresado en km/h

tiempo=d/(v2-v1)

minutos=tiempo*60 #Pasa de estar expresado en horas a minutos.


print("El coche de detrás ha tardado",minutos, "minutos en alcanzar al coche de delante.")