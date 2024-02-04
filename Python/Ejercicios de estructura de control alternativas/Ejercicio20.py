#Manuel Ripalda Delgado
#Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. 
#El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:

#Zona	Ubicación	Costo/gramo
#1	América del Norte	24.00 euros
#2	América Central	    20.00 euros
#3	América del Sur	    21.00 euros
#4	Europa	            10.00 euros
#5	Asia	            18.00 euros
#Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad.
#Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

peso=int(input("¿Cuánto pesa el paquete (en gramos)?:")) #Se solicita un peso de paquete en gramos.

cobro=0                     #Hay que darle un valor inicial al cobro del paquete para que siempre tenga un valor. Si no tuviera un valor inicial, el programa podría dar error.

if peso>0 and peso<=5000:   #Condición para asegurarse de que el paquete pesa entre 0 gramos y 5 kilos.

    continente=int(input("¿Adónde se envía el paquete? América del Norte 1, América Central 2, América del Sur 3, Europa 4, Asia 5:"))   #Se pregunta el continente de destino.

    if continente==1:   #En esta condicional, el cobro se determina según el continente de destino.

        cobro=peso*24

    elif continente==2:

        cobro=peso*20

    elif continente==3:

        cobro=peso*21

    elif continente==4:

        cobro=peso*10

    elif continente==5:

        cobro=peso*18
    
    else:               #Si no se introduce un número en el rango de 1-5, se muestra el siguiente mensaje en consola y se acaba el programa.
        
        print("No has introducido un destino válido. Refresque el programa.")
    
else:                   #Si no se introduce un número de gramos entre 0 y 5000, se muestra el siguiente mensaje en consola y se acaba el programa.

    print("Peso de paquete no válido según la política de la compañía. Refresque el programa.")

if cobro>1:             #Si se ha acumulado un nuevo valor en la variable cobro es que todos los datos se han rellenado correctamente y se puede mostrar el precio.

        print("Enviar este paquete a su destino costará", cobro,"euros.")

#Puesto que en el ejercicio se especifica que el costo por gramo es tan elevado, lo he dejado; sin embargo, la lógica dicta que sea por kilogramo, en cuyo caso hubiera
#añadido una conversión de gramos a kilogramos en la línea 21 tal y como comento en la línea 56:
#peso*=0.001
#Ahí ya tendrían más sentido los precios de los paquetes.