#Manuel Ripalda Delgado
#Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días.

meses_ripalda=["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

while True:

    numero_ripalda=int(input("Introduce el número del mes que quieras saber el número de días: "))

    if numero_ripalda<1 or numero_ripalda>12:

        print("El número debe ser entre 1 y 12 ya que hacen referencia a los meses del año.")
    
    else:

        if numero_ripalda==2:

            dias_ripalda=28
            
        elif  numero_ripalda==1 or numero_ripalda==3 or  numero_ripalda==5  or numero_ripalda==7 or  numero_ripalda==8 or numero_ripalda==10 or numero_ripalda==12:

            dias_ripalda=31

        else:

            dias_ripalda=30

        break

print(meses_ripalda[numero_ripalda-1]+":",dias_ripalda)