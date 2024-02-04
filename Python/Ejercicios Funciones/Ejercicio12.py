# Manuel Ripalda Delgado
# Vamos a mejorar el ejercicio anterior haciendo una función para validar la fecha. De tal forma que al leer una fecha se asegura que es válida.

from modules.FuncionEj12 import leerFecha as fecha
from modules.FuncionEj12 import calularDiaJuliano as diaJul

fecha_ripalda=fecha()

print(f"El día juliano es el {diaJul(fecha_ripalda[0],fecha_ripalda[1],fecha_ripalda[2])}.")