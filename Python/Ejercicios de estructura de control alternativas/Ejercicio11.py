#Manuel Ripalda Delgado
#Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
#Si se cumple Pitágoras entonces es triángulo rectángulo
#Si sólo dos lados del triángulo son iguales entonces es isósceles.
#Si los 3 lados son iguales entonces es equilátero.
#Si no se cumple ninguna de las condiciones anteriores, es escaleno.

import math

a=int(input("A:"))                          #Se definen los lados a,b y c.

b=int(input("B:"))

c=int(input("C; en caso de ser lados distintos, este es el más largo:"))         

pit=math.pow(c,2)                           #Se define el Teorema de Pitágoras.

if  pit==(math.pow(a,2)+math.pow(b,2)):     #Si la variable pit es igual a la fórmula del Teorema de Pitágoras, es un triángulo rectángulo.

    print("Triángulo rectángulo.")

elif a==b==c:                               #Si todos los lados son iguales, es un  triángulo  equilátero.

    print("Triángulo equilátero.")

elif   a==b or b==c or a==c:                #Si dos lados son iguales, es un triángulo isósceles.

    print("Triángulo isósceles.")

else:                                       #Si no se cumple ninguna de las condiciones anteriores, es un triángulo escaleno.

    print("Triángulo escaleno.")