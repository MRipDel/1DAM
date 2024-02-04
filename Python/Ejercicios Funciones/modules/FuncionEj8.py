# Función correspondiente al ejercicio 8

def factorial(fac,num):

    if num==0 or (num==1 and fac==1):

        fac=1
        
    elif num!=1:

        fac=factorial(fac*(num-1),num-1)

    return fac