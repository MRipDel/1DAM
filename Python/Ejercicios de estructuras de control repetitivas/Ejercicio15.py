#Manuel Ripalda Delgado
#Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un algoritmo para determinar cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.

mensualidad_ripalda=range(20)

total_pago_ripalda=0

for i_ripalda in mensualidad_ripalda:

    pago_ripalda=10*2**i_ripalda

    print("Mes "+str(i_ripalda+1)+":",pago_ripalda)

    total_pago_ripalda+=pago_ripalda

    print()

print("El total pagado en 20 mensualidades es",total_pago_ripalda)