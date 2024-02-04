Algoritmo Ejercicio_18_UD2
	Leer trabajo
	Leer horas_trabajadas
	Leer horas_remuneracion
	
	Si horas_trabajadas>35 Entonces
		
		horas_extra <- (horas_trabajadas-35)*horas_remuneracion*1.5
		horas_trabajadas <- 35
		
	FinSi
	
	salario_bruto <- horas_trabajadas*horas_remuneracion+horas_extra // Se establece el salario bruto
	
	Si salario_bruto<=500 Entonces 
		
		salario_neto <- salario_bruto
		
	SiNo
		
		salario_neto <- 500
		tasa_25 <- salario_bruto-salario_neto
		
	FinSi
	
	Si tasa_25>0 Y tasa_25<=400 Entonces
		
		tasa_25 <- tasa_25*0.75 										// Si la tasa del 25 %  se encuentra entre 1 y 400 entonces no hay necesidad de darle valor a la tasa del 45 % .
		salario_neto <- salario_neto+tasa_25
		
	SiNo
		
		tasa_45 <- (tasa_25-400)*0.55 								// Si la tasa del 25 %  es mayor a 400, se establece primero que lo que sobra de restarle 400 a la tasa del 25 %  es a lo que hay que quitarle el 45 % . 
		tasa_25 <- 300
		salario_neto <- salario_neto+tasa_25+tasa_45
		
	FinSi
	
	Escribir 'Trabajo: ', trabajo
	Escribir 'Salario bruto: ', salario_bruto, ' euros.'
	Escribir 'Tasa del 25% y 45%: ', tasa_25, ' y ', tasa_45, ' euros.'
	Escribir 'Salario neto: ', salario_neto
FinAlgoritmo
