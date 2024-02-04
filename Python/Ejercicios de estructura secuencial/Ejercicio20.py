#Manuel Ripalda Delgado
#Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de
#pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).

dosEur=int(input("¿Cuántas monedas de 2 euros tienes?:"))*2

unEur=int(input("¿Cuántas monedas de 1 euro tienes?:"))

cincueCent=int(input("¿Cuántas monedas de 50 céntimos tienes?:"))*50

veinCent=int(input("¿Cuántas monedas de 20 céntimos tienes?:"))*20

diezCent=int(input("¿Cuántas monedas de 10 céntimos tienes?:"))*10


cents=(cincueCent+veinCent+diezCent)        #Esto aún no sirve para hallar los céntimos, esto ssirve para hallar los euros.

euros=dosEur+unEur+cents//100               #cents//100 para hallar los euros resultado de sumar todos los céntimos.

cents%=100                                  #Ahora sí, junto con la operación de la línea 16, sirve para hallar los céntimos.

print("Entonces tienes",euros,"euros y",cents,"céntimos.")