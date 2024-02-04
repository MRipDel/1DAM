#Manuel Ripalda Delgado
#Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el
#mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a
#dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe
#imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

nota=float(input("Introduce una nota:"))            #Se pregunta la nota. Se permiten decimales.

edad=int(input("Introduce tu edad:"))               #Se pregunta la edad.

sexo=input("Indica tu sexo con F o M:")             #Se pregunta por el sexo. Se puede introducir F o M, incluso en minúsculas, porque luego se usa la función upper().


if nota>5 and edad>=18 and sexo.upper()=='F':       #Si se cumplen las condiciones, se muestra ACEPTADA.

    print("ACEPTADA")

elif nota>5 and edad>=18 and sexo.upper()=='M':     #Si se cumplen las condiciones, se muestra POSIBLE.

    print("POSIBLE")

else:                                               #Si no se cumple alguna de la condiciones, se muestra NO ACEPTADA.

    print("NO ACEPTADA")