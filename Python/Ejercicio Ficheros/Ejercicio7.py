# Manuel Ripalda Delgado

# El fichero cotizaciones.csv contiene las cotizaciones de las empresas del IBEX35 con las siguientes columnas: Nombre (nombre de la empresa), Final (precio de la acción al cierre de bolsa), Máximo (precio máximo de la acción durante la jornada), Mínimo (precio mínimo de la acción durante la jornada), Volumen (Volumen al cierre de bolsa), Efectivo (capitalización al cierre en miles de euros).

# Construir un programa que reciba el fichero de cotizaciones , devuelva un diccionario y lo imprima en la terminal con el mismo formato que el fichero. 

import csv

with open("cotizaciones.csv","r") as csv_ripalda:

    cotizaciones_ripalda=csv_ripalda.readlines()

csv_ripalda.close()

diccionario_cotizaciones_ripalda={}

# Por cada linea, se rellena el diccionario con parejas clave-valor. El nombre de la empresa es la clave, el valor es una lista conformada por el resto de sus valores correspondientes.
for empresa_ripalda in cotizaciones_ripalda:

    datos_empresa_ripalda=empresa_ripalda.split(",")

    clave_ripalda=datos_empresa_ripalda[0]

    datos_empresa_ripalda.remove(clave_ripalda)

    diccionario_cotizaciones_ripalda[clave_ripalda]=datos_empresa_ripalda

#Se muestra el diccionario con el formato deseado.
for clave_ripalda in diccionario_cotizaciones_ripalda.keys():

    print(clave_ripalda,end="")

    for valor_ripalda in diccionario_cotizaciones_ripalda[clave_ripalda]:

        print(f",{valor_ripalda}",end="")
    
    print()