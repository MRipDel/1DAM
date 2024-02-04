Algoritmo nomina_programador
	
	Leer cargo
	Leer dias_viaje
	Leer est_civ
	
	Segun cargo Hacer
		
		Opcion 1:
			
			empleo<-"Programador junior"
			sueldo<-950
			
		Opcion 2:
			
			empleo<- "Programador senior"
			sueldo<-1200
			
		Opcion 3:
			
			empleo<- "Jefe de proyecto"
			sueldo<-1600
			
	FinSegun
	
	dias_viaje<- dias_viaje*30
	
	Segun est_civ Hacer
			
		Opcion 1:
			
			estado_civil<- "soltero"
			sueldo<-(sueldo+dias_viaje)*0.75
			
		Opcion 2:
			
			estado_civil<- "casado"
			sueldo<-(sueldo+dias_viaje)*0.8
			
	FinSegun
	
	Escribir empleo , ", ", estado_civil, ",  ", sueldo
	
FinAlgoritmo
