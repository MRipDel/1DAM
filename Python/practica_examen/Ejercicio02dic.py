#Escribir un programa que pregunte al usuario su nombre, edad, dirección y teléfono y lo guarde en un diccionario. Después debe mostrar por pantalla el mensaje <nombre> tiene <edad> años, vive en <dirección> y su número de teléfono es <teléfono>.

diccionario={}

while True:

    nombre=input("Introduce tu nombre:")

    if nombre.isalpha():

        break

diccionario["Nombre"]=nombre.title

while True:

    edad=int(input("Introduce tu edad:"))

    if edad>0 and edad<120:

        break

diccionario["Edad"]=edad

