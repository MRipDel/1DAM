#Manuel Ripalda Delgado
#La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el 
#cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos 
#cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 
#céntimos, y a partir del décimo minuto, 50 céntimos. Además, se carga un impuesto de 3
#% cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 
#10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona
#que realiza una llamada.

tLlamada=int(input("Introduce los minutos de llamada:"))

dia=input("¿Es domingo? S o N:")        #A continuación emplearía una estructura Do-While (While True: ...) para asegurar que el valor introducido es una S o una N, pero al tener que emplear solo estructuras condicionales, esta opción no está disponible.

if tLlamada<=5:

    pago=1

elif tLlamada<=8:

    pago= 1.8

elif tLlamada<=10:

    pago=2.5

elif tLlamada>10:

    pago=3

if dia.upper()=="S":

    pago+=pago*0.03

elif dia.upper()=="N":

    momento=input("¿Es por la mañana o por la tarde? M o T:")   #Mismo caso que con la variable dia.

    if momento.upper()=="M":

        pago+=pago*0.15
    
    elif momento.upper()=="T":

        pago+=pago*0.1

print("El pago es",pago)