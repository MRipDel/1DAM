#Manuel Ripalda Delgado
#Escribir un algoritmo para calcular la nota final de un estudiante, considerando que:
#por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

correctas=int(input("Preguntas correctas:"))*5

incorrectas=int(input("Preguntas incorrectas:"))*-1

total=correctas+incorrectas

print("La puntuación total es",total)