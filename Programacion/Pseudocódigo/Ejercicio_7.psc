Algoritmo Ejercicio_7
	Definir N Como Real
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		
		Leer N
		
		Si N=0
			Escribir "No puedes introducir un 0, prueba con otro número."
			i<-i-1
		Sino
			
			Si N<0
				neg<-neg+1
			SiNo
				Si N>0
					pos<-pos+1
				FinSi
			FinSi
			
		FinSi
		
	FinPara
	Escribir "Hay ", neg, " números negativos y " , pos, "números positivos."

	
FinAlgoritmo
