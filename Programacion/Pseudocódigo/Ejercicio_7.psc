Algoritmo Ejercicio_7
	Definir N Como Real
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		
		Leer N
		
		Si N=0
			Escribir "No puedes introducir un 0, prueba con otro n�mero."
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
	Escribir "Hay ", neg, " n�meros negativos y " , pos, "n�meros positivos."

	
FinAlgoritmo
