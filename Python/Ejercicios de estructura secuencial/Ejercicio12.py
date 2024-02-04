#Manuel Ripalda Delgado
#Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.

import  math

coordenada1=[[int(input("Primera coordenada.\nX:"))],[int(input("Y:"))]]

coordenada2=[[int(input("Segunda coordenada.\nX:"))],[int(input("Y:"))]]

distanciaX=math.dist(coordenada1[0],coordenada2[0])

distanciaY=math.dist(coordenada1[1],coordenada2[1])

print("La distancia entre los puntos X e Y de las dos coordenadas es de:\nEje X:",distanciaX,"\nEje Y:",distanciaY)