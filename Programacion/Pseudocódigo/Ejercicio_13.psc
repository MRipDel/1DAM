Algoritmo Ejercicio_13
	
	Definir num, max, min Como Real	
	Definir intentos Como Entero			//Declaraci�n de variables
	Definir respuesta Como Caracter
	min<-1						//Se establece el valor m�nimo y el m�ximo inicial para que la l�nea 30 opere acorde a los limites del ejercicio.
	max<-101 					//Si se declarase el m�ximo en 100, en el caso de darse la situaci�n de 99 de minimo y 100 de m�ximo, al truncarse la media (l�nea 30) en 99'5 nunca podr�a llegar a 100.
	num<-azar(101)				//Funci�n que da un n�mero aleatorio entre 1 y N-1, por eso es 101 y no 100. Esto es para que a consola no muestre siempre los mismos n�meros y parezca un juego de verdad.
	
	Escribir "Piensa un n�mero del 1 al 100 y yo intentar� adivinarlo."

	Repetir					//Bucle Do-while porque hay que darle la oportunidad al programa de acertar a la primera.
		
		Escribir "�Tu n�mero es mayor (+), menor (-) o igual (=) a " ,num, "?"
		
		Leer respuesta
		
		Si respuesta="+" Entonces
			
			min<-num				//Si el n�mero es mayor de lo que dice el programa, el n�mero pasa a ser el m�nimo.
			
		SiNo
			Si respuesta="-" Entonces
				
				max<-num			//Si el n�mero es menorde lo que dice el programa, el n�mero pasa a ser el m�ximo.
				
			FinSi
		FinSi
	
		num<-trunc((min+max)/2)	//Operaci�n que determina el siguiente n�mero que mostrar� el programa en la l�nea 15.
		
		intentos<-intentos+1		//Para que sepamos en cu�ntos intentos acierta el programa.
		
	Hasta Que respuesta="="
	
	Si	intentos=1 Entonces	//Esta estructura es para que si el programa acierta a la primera, muestre la "1 intento" y no "1 intentos".
		
		Escribir "�Gan�! Me ha llevado ", intentos," intento."
		
	Sino
		
		Escribir "�Gan�! Me ha llevado ", intentos," intentos."
		
	FinSi
	

	
FinAlgoritmo
