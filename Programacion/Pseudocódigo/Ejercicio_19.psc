Algoritmo Ejercicio_19
	
	Definir N,contador,media Como Real
	Escribir "Introduce n�meros positivos para calcular su media. Si quieres terminar el programa, introduce un n�mero negativo."
	
	Repetir 
		
		Leer N
		Si N>=0
			
			media<-media+N
			contador<-contador+1
			Escribir "Introduce otro n�mero"
		FinSi
		
	Hasta Que N<0
	Si contador=0
		
		Escribir "Fin del programa."
		
	SiNo
		
		media<-media/contador
		Escribir "La media de los ", contador, " n�meros introducidos es ", media, "."
		Escribir "Fin del programa."
		
	FinSi

FinAlgoritmo
