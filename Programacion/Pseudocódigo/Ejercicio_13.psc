Algoritmo Ejercicio_13
	
	Definir num, max, min Como Real	
	Definir intentos Como Entero			//Declaración de variables
	Definir respuesta Como Caracter
	min<-1						//Se establece el valor mínimo y el máximo inicial para que la línea 30 opere acorde a los limites del ejercicio.
	max<-101 					//Si se declarase el máximo en 100, en el caso de darse la situación de 99 de minimo y 100 de máximo, al truncarse la media (línea 30) en 99'5 nunca podría llegar a 100.
	num<-azar(101)				//Función que da un número aleatorio entre 1 y N-1, por eso es 101 y no 100. Esto es para que a consola no muestre siempre los mismos números y parezca un juego de verdad.
	
	Escribir "Piensa un número del 1 al 100 y yo intentaré adivinarlo."

	Repetir					//Bucle Do-while porque hay que darle la oportunidad al programa de acertar a la primera.
		
		Escribir "¿Tu número es mayor (+), menor (-) o igual (=) a " ,num, "?"
		
		Leer respuesta
		
		Si respuesta="+" Entonces
			
			min<-num				//Si el número es mayor de lo que dice el programa, el número pasa a ser el mínimo.
			
		SiNo
			Si respuesta="-" Entonces
				
				max<-num			//Si el número es menorde lo que dice el programa, el número pasa a ser el máximo.
				
			FinSi
		FinSi
	
		num<-trunc((min+max)/2)	//Operación que determina el siguiente número que mostrará el programa en la línea 15.
		
		intentos<-intentos+1		//Para que sepamos en cuántos intentos acierta el programa.
		
	Hasta Que respuesta="="
	
	Si	intentos=1 Entonces	//Esta estructura es para que si el programa acierta a la primera, muestre la "1 intento" y no "1 intentos".
		
		Escribir "¡Gané! Me ha llevado ", intentos," intento."
		
	Sino
		
		Escribir "¡Gané! Me ha llevado ", intentos," intentos."
		
	FinSi
	

	
FinAlgoritmo
