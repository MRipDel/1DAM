#Manuel Ripalda Delgado
#Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

#Se declaran las variables que se requieran inicializadas desde un principio.
notas_ripalda=[]

contador_ripalda=1

media_ripalda=0

#Bucle para insertar las notas.
for i_ripalda in range(5):
    
    notas_ripalda.append(float(input("Introduce una nota:")))

    while True:

        

        if notas_ripalda[i_ripalda]>=0 and notas_ripalda[i_ripalda]<=10:

            break

        elif notas_ripalda[i_ripalda]<0  or notas_ripalda[i_ripalda]>10:  

            print(notas_ripalda[i_ripalda])
            
            notas_ripalda[i_ripalda]=float(input("Introduce una nota entre 0 y 10:"))

#Bucle para mostrar las notas y guardarlas en la variable media, que fuera del bucle se divide entre 5 para obtener la media.
for e_ripalda in notas_ripalda:

    print("Nota nº",str(contador_ripalda)+":",e_ripalda)

    media_ripalda+=e_ripalda

media_ripalda/=5

print(f"La media de las notas es : {media_ripalda:,.2f}","\nLa nota más alta es:",max(notas_ripalda),"\nLa nota más baja es",min(notas_ripalda))