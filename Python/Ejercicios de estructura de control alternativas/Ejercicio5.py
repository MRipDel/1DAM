#Manuel Ripalda Delgado
#Escribe un programa que pida un nombre de usuario y una contraseña y si se ha introducido “pepe” y “asdasd” se indica “Has entrado al sistema”, sino se da un error.

user="pepe"     #Se declara la respuesta correcta para el usuario.

pwd="asdasd"    #Se declara la respuesta correcta para la contraseña.

usuario=input("Introduce el usuario:")      #Se pide el valor para el usuario.

contra=input("Introduce la contraseña:")    #Se pide el valor para la contraseña.

if user==usuario and pwd==contra:             #Si user es igual a usuario Y pwd es igual a contra, la condición es verdadera y por lo tanto se muestra "Has entrado en al sistema."
    
    print("Ha entrado al sitema.")

else:                                       #En caso contrario, se muestra el mensaje "Error".

    print("Error.")