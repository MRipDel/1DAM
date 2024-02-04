Algoritmo Ejercicio_19
	
	Definir N,contador,media Como Real
	Escribir "Introduce números positivos para calcular su media. Si quieres terminar el programa, introduce un número negativo."
	
	Repetir 
		
		Leer N
		Si N>=0
			
			media<-media+N
			contador<-contador+1
			Escribir "Introduce otro número"
		FinSi
		
	Hasta Que N<0
	Si contador=0
		
		Escribir "Fin del programa."
		
	SiNo
		
		media<-media/contador
		Escribir "La media de los ", contador, " números introducidos es ", media, "."
		Escribir "Fin del programa."
		
	FinSi

FinAlgoritmo
