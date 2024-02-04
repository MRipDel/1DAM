# Manuel Ripalda Delgado
# Escribir una función que pida un número entero entre 1 y 10, lea el fichero primerapellido-n.txt con la tabla de multiplicar de ese número, donde n es el número introducido, y la muestre por pantalla. Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.

while True:
    n_ripalda=int(input("Introduce un número:"))

    if n_ripalda>=1 and n_ripalda<=10:

        break
    
    else:

        print("El número debe estar entre el 1 y el 10",end="")

nombre_ripalda=f"ripalda-{n_ripalda}.txt"

try:

    fichero_ripalda=open(nombre_ripalda,"r")

except FileNotFoundError:

    print("No existe el fichero con la tabla del",n_ripalda)

else:

    print(fichero_ripalda.read())

    fichero_ripalda.close()