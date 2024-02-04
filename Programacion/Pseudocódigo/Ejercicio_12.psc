Algoritmo Ejercicio_12
	
	Definir N Como Real
	Definir potencia, resultado Como Entero
	
	resultado<-1
	Escribir "Introduce el número."
	Leer N
	Escribir "Introduce la potencia."
	Leer potencia
	
	Para i<-1 Hasta potencia Con Paso 1 Hacer
		resultado<-resultado*N
	FinPara
	
	Escribir "El valor de ", N, " elevado a ", potencia, " es igual a ", resultado
	
FinAlgoritmo
