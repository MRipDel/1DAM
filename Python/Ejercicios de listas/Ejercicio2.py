#Manuel Ripalda Delgado
#Crea una lista e inicialízala con 5 cadenas de caracteres leídas por teclado. Copia los elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la pantalla.

lista_ripalda=[]

lista_inversa_ripalda=[]

for i_ripalda in range(5):

    lista_ripalda.append(input("Introduce una cadena de caracteres:"))

#Se guarda una copia de la lista en una nueva variable y se invierte el orden.
lista_inversa_ripalda=lista_ripalda.copy()

lista_inversa_ripalda.reverse()

#Se muestran los valores de la lista.
for j_ripalda in lista_inversa_ripalda:

    print(j_ripalda)

