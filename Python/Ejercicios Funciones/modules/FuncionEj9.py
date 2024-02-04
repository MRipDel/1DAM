# Función correspondiente al ejercicio 9

def calcular_mcd(n1,n2):

    mayor=max(n1,n2)

    menor=min(n1,n2)

    mcd=1

    if mayor%menor==0:

        mcd=menor

    else:

        while mcd!=menor:

            menor-=1

            if mayor%menor==0 and min(n1,n2)%menor==0:

                mcd=menor

    return mcd