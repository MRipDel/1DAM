#Manuel Ripalda Delgado
#Algoritmo que pida un número y diga si es positivo, negativo o 0.

num=float(input("Introduce un número:"))        #Se introduce un número por consola. Admite decimales.

if num>0:                                       #Se abre una estructura condicional múltiple, comenzando por comprobar si num es mayor a 0 para ver si es positivo.

    print(num,"es positivo.")

elif num<0:                                     #Aquí se comprueba si num es menor a 0 para ver si e negativo.
    
    print(num,"es negativo.")

else:                                           #Si no es ni mayor ni menor a 0, es que es igual a 0.

    print(num,"es igual a 0.")