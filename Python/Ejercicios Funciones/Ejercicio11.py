# Manuel Ripalda Delgado
# El día juliano correspondiente a una fecha es un número entero que indica los días que han transcurrido desde el 1 de enero del año indicado. Queremos crear un programa principal que al introducir una fecha nos diga el día juliano que corresponde. Para ello podemos hacer las siguientes subrutinas:

# LeerFecha: Nos permite leer por teclado una fecha (día, mes y año).
# DiasDelMes: Recibe un mes y un año y nos dice los días de ese mes en ese año.
# EsBisiesto: Recibe un año y nos dice si es bisiesto.
# Calcular_Dia_Juliano: recibe una fecha y nos devuelve el día juliano.

from modules.FuncionEj11 import leerFecha as fecha
from modules.FuncionEj11 import calularDiaJuliano as diaJul

fecha_ripalda=fecha()

print(f"El día juliano es el {diaJul(fecha_ripalda[0],fecha_ripalda[1],fecha_ripalda[2])}.")