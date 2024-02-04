Algoritmo Ejercicio_9_For
	
	Definir N, mult, sum Como Entero
	mult<-1
	Para N<-1 Hasta 10	Con Paso 1 Hacer
		mult<-mult*N
		sum<-sum+N
	FinPara
	N<-N-1
	Escribir "La multiplicacion de los ", N, " primeros números naturales es ", mult
	Escribir "La suma de los ", N, " primeros números naturales es ", sum
	
FinAlgoritmo
