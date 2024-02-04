#Manuel Ripalda Delgado
#Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.

dia=int(input("Día de la semana en número:"))   #Se pregunta el día de la semana.

if dia>=1 and dia<=7:                           #Condicional como estructura de control: si dia no está entre 1 y 7, se muestra un mensaje de error; de lo contrario, se muestra el día de la semana correspondiente. 

    if dia==1:                                  #Según el número introducido, se muestra el día de la semana correspondiente

        print("Lunes.")

    elif dia==2:

        print("Martes.")

    elif dia==3:

        print("Miércoles.")

    elif dia==4:

        print("Jueves.")

    elif dia==5:

        print("Viernes.")

    elif dia==6:       

        print("Sábado.")

    elif dia==7:       

        print("Domingo.")  

else:                                           #Si no se introduce un número en el rango de 1-7, se muestra el siguiente mensaje en consola y se acaba el programa.

    print("Error.")