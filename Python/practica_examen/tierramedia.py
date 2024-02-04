# Middle Earth is about to go to war. The forces of good will have many battles with the forces of evil. Different races will certainly be involved. Each race has a certain worth when battling against others. On the side of good we have the following races, with their associated worth:
# Hobbits: 1
# Men: 2
# Elves: 3
# Dwarves: 3
# Eagles: 4
# Wizards: 10
# On the side of evil we have:
# Orcs: 1
# Men: 2
# Wargs: 2
# Goblins: 2
# Uruk-Hai: 3
# Trolls: 5
# Wizards: 10
# Although weather, location, supplies and valor play a part in any battle, if you add up the worth of the side of good and compare it with the worth of the side of evil, the side with the larger worth will tend to win.
# Thus, given the count of each of the races on the side of good, followed by the count of each of the races on the side of evil, determine which side wins.
# Input:
# The function will be given two parameters. Each parameter will be a string of multiple integers separated by a single space. Each string will contain the count of each race on the side of good and evil.
# The first parameter will contain the count of each race on the side of good in the following order:
# Hobbits, Men, Elves, Dwarves, Eagles, Wizards.
# The second parameter will contain the count of each race on the side of evil in the following order:
# Orcs, Men, Wargs, Goblins, Uruk-Hai, Trolls, Wizards.
# All values are non-negative integers. The resulting sum of the worth for each side will not exceed the limit of a 32-bit integer.
# Output:
# Return "Battle Result: Good triumphs over Evil" if good wins, "Battle Result: Evil eradicates all trace of Good" if evil wins, or "Battle Result: No victor on this battle field" if it ends in a tie.

valor_heroes={"Hobbits":1,
        "men":2,
        "elves":3,
        "dwarves":3,
        "eagles":4,
        "wizards":10}

valor_villanos={"Orcs":1,
        "men":2,
        "wargs":3,
        "goblins":3,
        "uruk-Hai":3,
        "trolls":5,
        "wizards":10}

efectivos_heroes=[]

efectivos_villanos=[]

for soldados in valor_heroes.keys():

    while True:

        efectivos=int(input(f"Soldiers belonging to the {soldados} race: "))

        if efectivos>=0:

            efectivos_heroes.append(efectivos*valor_heroes.get(soldados))

            break

for soldados in valor_villanos.keys():
        
        while True:

            efectivos=int(input(f"Soldiers belonging to the {soldados} race: "))

            if efectivos>=0:

                efectivos_villanos.append(efectivos*valor_villanos.get(soldados))

                break

if sum(efectivos_heroes)>sum(efectivos_villanos):
     
     print("Middle Earth is saved!")

else:

    print("They took Isengard to the hobbits :(")