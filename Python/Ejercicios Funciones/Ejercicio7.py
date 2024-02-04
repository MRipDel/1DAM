# Manuel Ripalda Delgado
# Crear una subrutina llamada “Login”, que recibe un nombre de usuario y una contraseña y te devuelve Verdadero si el nombre de usuario es “usuario1” y la contraseña es “asdasd”. Además recibe el número de intentos que se ha intentado hacer login y si no se ha podido hacer login incremente este valor.
# Crear un programa principal donde se pida un nombre de usuario y una contraseña y se intente hacer login, solamente tenemos tres oportunidades para intentarlo.

from modules.FuncionEj7 import login

intentos=0

nombre_ripalda=input("Introduzca su nombre de usuario:")

contraseña_ripalda=input("Introduzca su contraseña: ")

if login(nombre_ripalda,contraseña_ripalda,intentos)==True:

    print("Acceso permitido.")

else:

    print("Consumió sus tres intentos. Acceso denegado.")