#Manuel Ripalda Delgado
#Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de
#viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine
#la hora de llegada a la ciudad B.

print("Escribe la hora de salida según te vaya pidiendo:")

horas=int(input("Horas:"))

min=int(input("Minutos:"))

s=int(input("Segundos:"))

t=int(input("Ahora introduce los segundos que se tarda en llegar a la ciudad B:"))

#Ya se han establecido los valores iniciales, ahora comienza la conversión de t en horas, minutos y segundos.

sumHoras=t//3600    #Se hace una división que devuelve enteros a t para hallar las horas.

sumMin=(t%3600)//60 #Al resto de una hora se le divide entre 60 esperando un entero y eso da los minutos.

sumS=t%60           #El resto de dividir el tiempo entre 60 son los segundos sueltos equivalente a los decimales que se han perdido en la operación de sumMin.

#Ahora que t está convertido a horas, minutos y segundos, comienza la suma de t a los valores iniciales.

s+=sumS                         #Se suman los segundos. Si da más de 60, se sumará 1 en la siguiente operación.

min=(min+sumMin+s//60)          #Se suman los minutos. Si da má de 60, otra vez se sumará 1 en la siguiente operación.

horas=(horas+sumHoras+min//60)%24    #Se establece el valor de horas. En caso de pasar de las 12 de la noche, el resto serán las horas.

min%=60                         #Se establece el valor de los minutos.

s%=60                           #Se establece el valor de los segundos.

print("El ciclista ha llegado a las",horas,":",min,":",s)