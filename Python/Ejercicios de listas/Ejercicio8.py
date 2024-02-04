#Manuel Ripalda Delgado
#Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos: Todos lo alumnos mayores de edad. Los alumnos mayores (los que tienen más edad).

nombre_ripalda=[]

edad_ripalda=[]

mayores_edad_ripalda=[]

index_ripalda=0

mayor_ripalda=11

#Bucle donde se realizan las solicitudes de los nombres y de las edades de los alumnos.
while True:

#Bucle para asegurar que no se pueden introducir caracteres especiales o números en el nombre a excepción de un asterisco.
    while True:

        nombre_alumno_ripalda=input("Nombre del alumno:")

        if nombre_alumno_ripalda.isalpha()==True or nombre_alumno_ripalda=="*":

            nombre_ripalda.append(nombre_alumno_ripalda.capitalize())

            break
        
        else:

            print("Un nombre no contiene números ni caracteres especiales. Vuelve a introducirlo.")

    while True and "*" not in nombre_ripalda:

        edad_alumno_ripalda=int(input(f"Edad de {nombre_ripalda[index_ripalda]}:"))   

        if edad_alumno_ripalda>=12:

            edad_ripalda.append(edad_alumno_ripalda)

            if edad_ripalda[index_ripalda]>=18:

                mayores_edad_ripalda.append(nombre_alumno_ripalda.capitalize())

            if edad_ripalda[index_ripalda]>mayor_ripalda:

                mayor_ripalda=edad_ripalda[index_ripalda]

                nombre_mayor_ripalda=nombre_alumno_ripalda.capitalize()

            break   
        
        else:

            print("Introdduce una edad válida.")

    index_ripalda+=1

    if "*" in nombre_ripalda:

        break

#Una vez fuera del bucle, según los datos aportados se presentan tres posibles escenarios.
if mayores_edad_ripalda!=[]:

    print("Lista de mayores de edad:")

    for i_ripada in mayores_edad_ripalda:

        print(i_ripada)

    print(f"El mayor entre los mayores es {nombre_mayor_ripalda} con {mayor_ripalda} años.")

elif nombre_ripalda==["*"]:

    print("No has introducido ningún alumno.")

else:

    print(f"No has introducido ningún alumno mayor de edad, y el mayor de los alumnos menores de edad es {nombre_mayor_ripalda} con {mayor_ripalda} años.")