Algoritmo Ejercicio_6
	Definir N Como Real
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer

		Leer N
		
		Si N=0
			Escribir "No puedes introducir un 0, prueba con otro n�mero."
			i<-i-1
		Sino
			
			Si N<0
				neg<-1
			FinSi
		FinSi
	FinPara
	
	Si neg>1
		Escribir "Hay n�meros negativos."
	Sino
		Escribir "No hay n�meros negativos."
	FinSi
	
FinAlgoritmo
