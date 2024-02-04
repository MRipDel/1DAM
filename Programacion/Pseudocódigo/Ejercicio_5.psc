Algoritmo Ejercicio_5
	//Factorial es multiplicar todos los numeros positivos entre n y 1
	Definir N, i, resultado Como Entero
	resultado<-1
	Escribir "Introduce un número"
	Leer N
	i<-N
	Si i<>0
		
		resultado<-N
		
		Mientras i<>1
			
			i<-i-1
			
			resultado<-resultado*i
			
		FinMientras
		
	SiNo

	FinSi
	
	Escribir "El factorial de ", N, " es igual a ", resultado

FinAlgoritmo
