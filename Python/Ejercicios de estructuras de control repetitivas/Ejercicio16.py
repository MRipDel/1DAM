#Manuel Ripalda Delgado
#Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además, calcule cuánto pagó la empresa por los N empleados.
empleados_ripalda=int(input("¿Cuántos empleados hay en la empresa?: "))

plantilla_ripalda=[]

horas_trabajas_ripalda=[]

cobro_horas_ripalda=[]

sueldo_total_trabajadores_ripalda=0

for i_ripalda in range(empleados_ripalda):

    plantilla_ripalda.append(input("Nombre de empleado:"))

    horas_trabajas_ripalda.append(int(input(f"¿Cuántas horas trabaja "+plantilla_ripalda[i_ripalda]+" ?: ")))

    cobro_horas_ripalda.append(float(input(f"¿Cuánto cobra "+plantilla_ripalda[i_ripalda]+" por hora?: ")))

    print()


for e_ripalda in range(empleados_ripalda):

    sueldo_semanal_trabajador_ripalda=horas_trabajas_ripalda[e_ripalda]*cobro_horas_ripalda[e_ripalda]

    print("El sueldo semanal de "+plantilla_ripalda[e_ripalda]+" es de", "%1.2f"%sueldo_semanal_trabajador_ripalda)

    sueldo_total_trabajadores_ripalda+=sueldo_semanal_trabajador_ripalda

    print()

print("Lo que paga la empresa a sus empleados es",sueldo_total_trabajadores_ripalda)