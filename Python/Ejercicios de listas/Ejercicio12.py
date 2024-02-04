#Manuel Ripalda Delgado
#Diseñar el algoritmo correspondiente a un programa, que: Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’. Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor 0.
#  111111111111111
#  100000000000001
#  100000000000001
#  100000000000001
#  111111111111111
# Visualiza el contenido de la matriz en pantalla.

marco_ripalda=[[],[],[],[],[]]

for listaY_ripalda in range(1,6):

    for listaX_ripalda in range(1,16):

        if listaY_ripalda==1 or listaY_ripalda==5 or listaX_ripalda==1 or listaX_ripalda==15:

            print(1,end="")
        
        else:

            print(0,end="")
        
    print()