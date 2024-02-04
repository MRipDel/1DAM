# Manuel Ripalda Delgado
# Escribir una función que pida dos números n y m entre 1 y 10, lea el fichero primerapellido-n.txt con la tabla de multiplicar de ese número, y muestre por pantalla la línea m del fichero. Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.

while True:
    n_ripalda=int(input("Introduce un número:"))

    if n_ripalda>=1 and n_ripalda<=10:

        break
        
    else:

        print("El número debe estar entre el 1 y el 10",end="")

while True:
    m_ripalda=int(input("Introduce la línea a leer:"))

    if m_ripalda>=1 and m_ripalda<=10:

        break
        
    else:

        print("El número debe estar entre el 1 y el 10",end="")

nombre_ripalda=f"ripalda-{n_ripalda}.txt"


try:

    fichero_ripalda=open(nombre_ripalda,"r")

except FileNotFoundError:

    print("No existe el fichero con la tabla del",n_ripalda)

else:

    for i_ripalda in  range (1,11):


        if i_ripalda==m_ripalda:

            print(fichero_ripalda.readline())
        
        else:

            fichero_ripalda.readline()
    
    fichero_ripalda.close()

