# Función correspondiente al ejercicio 2

def es_multiplo(n1,n2):

    if(n2%n1==0):

        cadena=f"{n2} es múltiplo de {n1}."

    else:

        cadena=f"{n2} no es múltiplo de {n1}."
    
    return print(cadena)