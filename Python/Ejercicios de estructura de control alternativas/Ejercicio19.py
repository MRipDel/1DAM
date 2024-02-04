#Manuel Ripalda Delgado
#Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

mes=int(input("Indica el mes en números del 1 al 12:")) #Se pide un número del 1 al 12. No se ha incluído una estructura de control con un bucle porque son ejercicios con condicionales exclusivamente.

if mes==2:                                                  #Para el mes de febrero se crea este if.

    print("Este mes tiene 28 días, 29 en año bisiesto.")

elif mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:      #Para los meses que tienen 31 días este elif.

    print("Este mes tiene 31 días.")

elif mes==4 or mes==6 or mes==9 or mes==11:                                     #Para los meses qu tienen 30 días este elif.

    print("Este mes tiene 30 días.")

#No se usa un else porque no interesa que se pueda meter un número fuera del rango 1-12 y de un resultado.