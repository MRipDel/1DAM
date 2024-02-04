# Función correspondiente al ejercicio 1

def escribir_centrado(texto):
    
    cadena=""

    cadena+=" "*(int(40-len(texto)/2))+texto+"\n"+" "*(int(40-len(texto)/2))+"="*len(texto)

    return print(cadena)