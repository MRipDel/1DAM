#Manuel Ripalda Delgado
#Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.

dia=int(input("Introduce un día:"))

mes=int(input("Introduce un mes:"))

año=int(input("Introduce un año:"))

#Puesto que todos los elif realizan la misma instrucción que  el if, se podrían incluir todas las conficiones en el if,entre paréntesis y unidas por el operador lógico or, 
#pero en pos de una mayor legibilidad se ha realizado una condicional múltiple.

if mes==2 and (dia<=28 or (dia<=29 and(año%4==0 and (not año%100==0 or año%400==0)))):  #Para el mes de febrero se tiene en cuenta los años bisiestos.

    print("Correcto.")

elif (mes==4 or mes==6 or mes==9 or mes==11) and dia<=30:                               #Para los meses de 30 días.

    print("Correcto.")

elif (mes==1 or mes==3 or mes==5 or mes==7 or mes==10 or  mes==12) and dia<=31:         #Para los meses de 31 días.

    print("Correcto.")

else:                                                                                   #Para los casos en los que no se cumplan las condiciones, se imprime "Incorrecto." en consola.

    print("Incorrecto.")