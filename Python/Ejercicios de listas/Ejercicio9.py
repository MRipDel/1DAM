#Manuel Ripalda Delgado
#Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la siguiente información:La temperatura media de cada día. Los días con menos temperatura. Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima coincide con ella. si no existe ningún día se muestra un mensaje de información.

temp_max_ripalda=[]

temp_min_ripalda=[]

temp_media_ripalda=[]

for temp_ripalda in range(5):

    print(f"Introduce las temperatura del día {temp_ripalda+1}.")
   
    temp1=float(input("1ª temperatura: "))

    if temp1 in temp_max_ripalda:

        print("Coincide con las máximas de:")

        for index_ripalda in temp_media_ripalda:

            print(f"Día {temp_max_ripalda.index(0)}")

    temp2=float(input("2ª temperatura: "))

    if temp2 in temp_max_ripalda:

        print("Coincide con las máximas de:")

        for index_ripalda in range(temp_ripalda):

            print(f"Día {temp_max_ripalda.index(0)}")

        

    if temp1<=temp2:
          
        temp_max_ripalda.append(temp2)

        temp_min_ripalda.append(temp1)
    
    elif temp1>temp2:

        temp_max_ripalda.append(temp1)

        temp_min_ripalda.append(temp2)
    


