#Manuel Ripalda Delgado
#Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.

a=int(input("¿Cuánto vale A?:"))

b=int(input("¿Cuánto vale B?:"))

c=a     #Se crea una tercera variable, donde se acumula el valor inicial de a.

a=b     #Se acumula el valor de b en a. 

b=c     #Se acumula el valor inicial de a en b.

print("El valor de a ahora es",a,"y el valor de b ahora es",b)

