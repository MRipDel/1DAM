# Manuel Ripalda Delgado
# Escribir una función que pida un número entero entre 1 y 10 y guarde en un fichero con el nombre primer apellido-n.txt la tabla de multiplicar de ese número, donde n es el número introducido.

while True:
    n_ripalda=int(input("Introduce un número:"))

    if n_ripalda>=1 and n_ripalda<=10:

        break
    
    else:

        print("El número debe estar entre el 1 y el 10",end="")

fichero_ripalda=open(f"ripalda-{n_ripalda}.txt","w")

for numero_ripalda in range(1,11):

    fichero_ripalda.write(f"{n_ripalda} x {numero_ripalda} = {n_ripalda*numero_ripalda}\n")

fichero_ripalda.close()