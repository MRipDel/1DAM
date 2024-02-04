# Funciones correspondientes al ejercicio 10

def tiempoSegundos(horas,minutos,segundos):

    return horas*3600+minutos*60+segundos

def tiempoHorMinSeg(segundos):

    horas=0
    minutos=0
    if segundos>=3600:
        
        horas=int(segundos/3600)
        segundos%=3600

    if segundos>=60:

        minutos=int(segundos/60)
        segundos%=60
    
    return print(f"Horas: {horas}.\t Minutos: {minutos}.\t Segundos: {segundos}.")

        

        

