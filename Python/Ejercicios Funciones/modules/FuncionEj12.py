# Función correspondientes al ejercicio 12
def diasDelMes(mes,año):

    if esBisiesto(año)==True:

        dias_mes=[31,28,31,30,31,30,31,31,30,31,30,31]
        
    else: 

        dias_mes=[31,29,31,30,31,30,31,31,30,31,30,31]
    

    return dias_mes[mes-1]

def esBisiesto(año):

    if (año%4==0 and año % 100 != 0) or (año % 400 == 0):

        bisiesto=True
        
    else:
       
        bisiesto=False

    return bisiesto

def calularDiaJuliano(dia, mes, año):

    dias_total=dia

    for i in range(mes-1):

        dias_total+=diasDelMes(i,año)


    return dias_total

def leerFecha():

    print("Introduce una fecha.")

    dia=int(input("Día:"))

    mes=int(input("Mes:"))

    año=int(input("Año:"))

    if comprobarFecha(dia,mes,año)==True:

        return [dia,mes,año]
    
    else:

        print("Fecha no válida.")

        return leerFecha()

def comprobarFecha(dia,mes,año):

    dias_mes=diasDelMes(mes,año)

    if dia in range(1,dias_mes+1):

        fecha_correcta=True
    
    else:

        fecha_correcta=False

    return fecha_correcta
