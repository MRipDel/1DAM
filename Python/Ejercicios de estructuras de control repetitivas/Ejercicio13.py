#Manuel Ripalda Delgado
#Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas.

dias_trabajados_ripalda=["Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"]

salario_total_ripalda=0

total_horas_ripalda=0

precio_hora_ripalda=float(input("Salario por hora:"))

while True:

    dia_descanso_trabajador_ripalda=int(input("Indica el día de la semana (del 1 al 7) que descansa el trabajador:"))-1

    if dia_descanso_trabajador_ripalda>=0 and dia_descanso_trabajador_ripalda<=6:

        dia_descanso_trabajador_ripalda=dias_trabajados_ripalda[dia_descanso_trabajador_ripalda]

        break

dias_trabajados_ripalda.remove(dia_descanso_trabajador_ripalda)

for i_ripalda in dias_trabajados_ripalda:

    horas_ripalda=int(input("Horas trabajadas el "+i_ripalda+":"))

    total_horas_ripalda+=horas_ripalda
    
salario_total_ripalda+=total_horas_ripalda*precio_hora_ripalda
    
print("El salario total de la semana del trabajador es",salario_total_ripalda, "por un total de ",total_horas_ripalda,"horas trabajadas")