#Manuel Ripalda Delgado
#Algoritmo que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.

nums_ripalda=range(1,6)

for i_ripalda in nums_ripalda:

    print("Tabla del "+str(i_ripalda)+":")

    for e_ripalda in range(1,11):

        print(i_ripalda,"x",e_ripalda,"=",i_ripalda*e_ripalda)

    print()