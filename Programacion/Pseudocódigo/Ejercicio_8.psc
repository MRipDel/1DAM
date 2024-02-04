Algoritmo Ejercicio_8
	
	Definir N,neg,pos Como Real
	
	Repetir
		Leer N
		Si N<0
			neg<-neg+1
		SiNo
			Si N>0
				pos<-pos+1
			FinSi
		FinSi
	Hasta Que N=0 
	Si neg>0
		Escribir "Hay números negativos."
	SiNo
		Escribir "No hay números negativos."
	FinSi
	Escribir "Hay ", pos, " nº pos. y ", neg," nº neg."
	
FinAlgoritmo
