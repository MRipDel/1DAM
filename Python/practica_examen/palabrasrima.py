#Escribe un programa que pida dos palabras y diga si riman o no. 
#Si coinciden las tres últimas letras tiene que decir que riman.
#Si coinciden sólo las dos últimas tiene que decir que riman un poco y si no, que no riman.

palabra1=input("Introduce una palabra: ")

palabra2=input("Introduce otra palabra: ")

if (palabra1[len(palabra1)-4:len(palabra1)-1]==palabra2[len(palabra2)-4:len(palabra2)-1]):

    print(f"{palabra1} y {palabra2} riman")

else:

    print(f"{palabra1} y {palabra2} no riman")