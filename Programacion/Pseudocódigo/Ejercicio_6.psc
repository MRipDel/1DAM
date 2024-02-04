Algoritmo Ejercicio_6
	Definir N Como Real
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer

		Leer N
		
		Si N=0
			Escribir "No puedes introducir un 0, prueba con otro número."
			i<-i-1
		Sino
			
			Si N<0
				neg<-1
			FinSi
		FinSi
	FinPara
	
	Si neg>1
		Escribir "Hay números negativos."
	Sino
		Escribir "No hay números negativos."
	FinSi
	
FinAlgoritmo
