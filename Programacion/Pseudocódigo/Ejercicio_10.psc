Algoritmo Ejercicio_10
	
	Definir N Como Real
	Definir diez Como Logico
	
	diez=Falso
	Escribir "Introduce n�meros del 0 al 10,  introduce -1 para finalizar el programa."
	Repetir
		Leer N
		Si N>10 O N<-1 Entonces
	
		Escribir "Introduce n�meros del 0 al 10,  introduce -1 para finalizar el programa."
		Sino
			Si N=10 Entonces
				
				diez=Verdadero
			FinSi
		FinSi
	Hasta Que N=-1
	Si diez=Verdadero
		Escribir "Hab�a un diez en la secuencia."
	Sino
		Escribir "No hab�a un diez en la secuencia."
	FinSi
	
	Escribir "Fin del programa."
	
FinAlgoritmo
