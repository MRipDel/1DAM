#Manuel Ripalda Delgado
#La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
#la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta
#del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un 
#productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A,
#se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de 
#tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos 
#cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.

precio=float(input("Fija el precio base del kilo de uva:"))     #Se pide el kilo base de la uva.

kilos=float(input("¿Cuántos kilos de uva quieres vender?:"))    #Se pide los kilos a vender.

tipo=input("¿Tipo A o B?:")                                     #Se pide el tipo de uva.

tam=int(input("¿Tamaño 1 o 2?:"))                               #Se pide el tamaño de la uva.

#En este punto del código, incluiría una estructura de control repetitiva
#(un while True) para asegurar que los valores introducidos son correctos. 

if tipo.upper()=="A":   #Se usa la función upper() para que el usuario pueda introducir mayúsculas o minúsculas.

    precio+=0.2

elif  tipo.upper()=="B":

    precio+=0.3

if  tam==1:

    precio-=0.30

elif tam==2:

    precio-=0.50

ganancia=precio*kilos  #Fórmula de la ganancia, el precio obtenido x los kilos que se deseen vender.

print("La ganancia obtenida es de",ganancia)