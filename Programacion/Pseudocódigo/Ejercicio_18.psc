Algoritmo Ejercicio_18
	Definir combinacion Como Logico
	Definir intento, contador Como Entero
	contador<-1
	Escribir "Introduce la combinación de 4 cifras para abrir la caja fuerte."
	Mientras combinacion=Falso
		
		Leer intento
		
		Si intento=1234 O contador=4
			combinacion=Verdadero
		SiNo
			contador<-contador+1
		FinSi
		
	FinMientras
	Si intento=1234
		Escribir "Accesp permitido."
	SiNo
		Escribir "Acceso denegado."
	FinSi
FinAlgoritmo
