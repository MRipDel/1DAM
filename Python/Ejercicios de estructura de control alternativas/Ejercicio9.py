#Manuel Ripalda Delgado
#Algoritmo que pida tres números y los muestre ordenados (de mayor a menor).

nums=[int(input("Primer número:")),int(input("Segundo número:")),int(input("Tercer número:"))] #Se recogen los tres números en una lista.

nums.sort(reverse=True)  #Se ordena la lista nums con la función sort(). Esta función ordena de menor a mayor, pero puede recoger la variable reverse y darle el valor True, el cual está en False de manera predeterminada.

print(nums[0],nums[1], nums[2]) #Si se imprimiese directamente la variable nums, mostraría la lista con los corchetes. Como solo se pide los números, se imprimen los valores acumulados en las tres posiciones de la lista.
