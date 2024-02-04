#Escribir un programa que guarde en una variable el diccionario {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}, pregunte al usuario por una divisa y muestre su símbolo o un mensaje de aviso si la divisa no está en el diccionario.

diccionario={"Euro":"€",
             "Dollar": "4",
             "Yen":"¥"}



divisa=input("Introduce una divisa:")

if divisa.capitalize() in diccionario.keys():

    print(f"El símbolo del {divisa.capitalize()} es {diccionario.get(divisa.capitalize())}")

else:

    print(f"{divisa.capitalize()} no está en el diccionario.")