#Manuel Ripalda Delgado
#El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto
#debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma
#de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; 
#de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el 
#costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
#Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

numAlum=int(input("Número de alumnos:")) #Se introduce el nº de  alumnos.

if numAlum>=100:                         #Empiezan las condicionales, según el número de alumnos se aplican las tarifas mencionadas en el enunciado.

    pAlum=65

    pAutobus=numAlum*pAlum               #Esta fórmula aparece varias veces, pero es necesaria no sacarla fuera de la estructura condicional por el caso del else.

elif numAlum>=50:

    pAlum=70

    pAutobus=numAlum*pAlum

elif numAlum>=30:

    pAlum=90

    pAutobus=numAlum*pAlum

else:

     pAutobus=4000

     pAlum=4000/numAlum                  #En este caso cambia la fórmula porque dan un precio fijo para el autobus, entonces hay que repartir el costo entre los alumnos.

print("El precio del autobús es",pAutobus,"y el precio por alumno es",round(pAlum))