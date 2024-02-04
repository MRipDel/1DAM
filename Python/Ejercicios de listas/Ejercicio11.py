#Manuel Ripalda Delgado
#Crea una tabla bidimensional de longitud 5x5 y nombre ‘diagonal’. Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz tomen el valor 1 y el resto el valor 0. Muestra el contenido de la tabla en pantalla.

diagonal_ripalda=[[],[],[],[],[]]

ejeY_ripalda=1

for fila_ripalda in diagonal_ripalda:

    for ejeX_ripalda in range(1,6):

        if ejeX_ripalda==ejeY_ripalda or 6-ejeX_ripalda==ejeY_ripalda:

            print(1,end=" ")

        else:

            print(0,end=" ")
        
    ejeY_ripalda+=1

    print()