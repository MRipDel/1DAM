#Manuel Ripalda Delgado
#Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
#el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por 
#las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

sueBase=int(input("Sueldo base: "))

comision=sueBase*0.3

sueTotal=sueBase+comision

print("Obtenido por comisiones:",comision,"\nPercibido total:",sueTotal)