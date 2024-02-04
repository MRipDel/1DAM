Algoritmo precio_Tarta
	
	Definir tarta Como Real
	Escribir "¿De qué sabor quiere la tarta?" 
	
	Definir respuesta Como Entero
	
	Repetir
		Escribir "Por favor, marque 1 si quiere la tarta de manzana, 2 de fresa o 3 de chocolate."
		Leer respuesta
	Hasta Que respuesta=1 O respuesta=2 O respuesta=3
	
	Segun respuesta Hacer
		
		Opcion 1:
			
			tarta<-18
			
		Opcion 2:
			
			tarta<-16
			
		Opcion 3:
			Escribir "¿De chocolate negro o blanco? Negro 1, blanco 2."
			Leer tipo_choc
			
			Mientras tipo_choc<>1 Y tipo_choc<>2 Hacer
				
				Escribir "Por favor, marque 1 si quiere la tarta de chocolate negro y 2 si de chocolate blanco."
				Leer tipo_choc
				
			FinMientras
			
			Si tipo_choc=1
				tarta<-14
			SiNo
				tarta<-15
			FinSi
			
	Fin Segun
	
	Escribir "Ahora puede personalizar su tarta aún más."
	
	Escribir "Si desea personalizarla con un nombre, marque 1, si desea añadirle nata, marque 2, si no desea personalizarla, marque 3."

	Leer personalizar
	
	Segun personalizar Hacer
		
		Opcion 1:
			tarta<- tarta+2.75
		Opcion 2:
			tarta<- tarta+2.5
		Opcion 3:
	
	FinSegun
	
	Escribir "El precio de su tarta es de ",tarta," euros."
	
FinAlgoritmo
