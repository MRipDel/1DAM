#Manuel Ripalda Delgado
#Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
#55% del promedio de sus tres calificaciones parciales.
#30% de la calificación del examen final.
#15% de la calificación de un trabajo final.


notaParcial=[float(input("Primer parcial:")),float(input("Segundo parcial:")),float(input("Tercer parcial:"))]

parcialMedia=((notaParcial[0]+notaParcial[1]+notaParcial[2])/3)*0.55

examFinal=(float(input("Nota examen final:")))*0.30

trabFinal=(float(input("Nota trabajo final:")))*0.15

notAlgoritmo=parcialMedia+examFinal+trabFinal

print("La nota final de la asignatura de Algoritmos es:",notAlgoritmo)





