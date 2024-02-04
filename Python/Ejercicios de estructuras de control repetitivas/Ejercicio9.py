#Manuel Ripalda Delgado
#Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

num_ripalda=1

base_ripalda=int(input("Introduce la base:"))

while True:

    exponente_ripalda=(int(input("Introduce el exponente:")))

    if exponente_ripalda>0:

        break

for i_ripalda in range(exponente_ripalda):

    num_ripalda*=base_ripalda    

print("Resultado:",num_ripalda)