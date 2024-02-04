# Función correspondiente al ejercicio 7

def login(usuario,password,intentos):

    correcto=False

    if usuario=="usuario1" and password=="asdasd":
        
        correcto=True
    
    elif (usuario!="usuario1" or password!="asdasd") and  intentos<2:
    
        intentos+=1

    # Vi necesario el uso de una función recursiva en este ejercicio. Se contemplan
        login(input(f"Login incorrecto. Llevas {intentos} intentos.\n Introduzca su nombre de usuario:"),input("Introduzca su contraseña: "),intentos)  

    return correcto