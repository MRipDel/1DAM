#Manuel Ripalda Delgado
#Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

letra=input("Introduce una letra:")             #Se introduce una cadena de caracteres en consola.

if len(letra)==1 and letra.isupper()==True:     #Si la función len() devuelve 1, por lo que la cadena tiene un solo caracter, Y la función isupper() es verdadero, por lo que el caracter es una letra mayúscula, se cumplen las condiciones.

    print(letra,"es una letra mayúscula.")      #Si la cadena fueran dos mayúsculas, no se mostraría este mensaje, pero el ejercicio pide UNA letra mayúscula.

else:                                           #Si no se cumplen las condiciones, devuelve el siguiente mensaje.

    print(letra, "no es una letra mayúscula.")  