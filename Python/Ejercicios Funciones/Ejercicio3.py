# Manuel Ripalda Delgado
# Crear una función que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. Crear un programa principal, que utilizando la función anterior, vaya pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la media. El programa pedirá el número de días que se van a introducir.

from modules.FuncionEj3 import temp_media as media

num_dias_ripalda=int(input("¿Cuántos días quieres introducir?:"))

for dia_ripalda in range(1, num_dias_ripalda+1):

    temp_min_ripalda=float(input(f"Temperatura mínima del día {dia_ripalda}:"))

    temp_max_ripalda=float(input(f"Temperatura máxima del día {dia_ripalda}:"))

    print(f"La media de temperaturas del día {dia_ripalda} es {media(temp_min_ripalda,temp_max_ripalda):.2f}")