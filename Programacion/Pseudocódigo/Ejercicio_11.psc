Algoritmo Ejercicio_11
	
	Definir N, impares, pares Como Entero
	
	Para N<-100 Hasta 200 Con Paso 1 Hacer
		
		Si N%2=0
			pares<-pares+N
		SiNo
			impares<-impares+N
		FinSi
	FinPara
	Escribir "La suma de los números pares entre 100 y 200 es ", pares, ", y la de los impares es ",impares
FinAlgoritmo
