#Manuel Ripalda Delgado
#Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos circunferencias y las clasifique en uno de estos estados:
#exteriores
#tangentes exteriores
#secantes
#tangentes interiores
#interiores
#concéntricas

import math

x1=int(input("Primera circunferencia.\nX:"))                #Se preguntan las coordenadas y el radio de la primera circuferencia.

y1=int(input("Y:"))     

r1=int(input("Radio:"))

x2=int(input("Segunda circunferencia.\nX:"))                #Se preguntan las coordenadas y el radio de la primera circuferencia.

y2=int(input("Y:"))    

r2=int(input("Radio:"))

sumaR=r1+r2                                                 #Se define la suma de los radios.

dif=abs(r2-r1)                                              #Se calcula la diferencia entre los radios.

dist=abs(math.sqrt((math.pow(x2-x1,2)+math.pow(y2-y1,2))))  #Se calcula la distancia entre las circunferencias.

if dist>sumaR:

    print("Exterior.")

elif dist==sumaR:

    print("Tangente exterior.")

elif dist<sumaR and dist>sumaR:

    print("Secante.")

elif dist==dif:

    print("Tangente interior.")

elif dist<dif:

    print("Interior.")

elif dist==0:

    print ("Interior concéntrica.")