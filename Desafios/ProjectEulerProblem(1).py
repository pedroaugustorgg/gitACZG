#Desafio 1: Multiples of 3 or 5
x = 0
for i in range(0,1000):
    if not i%5 or not i%3:
        x = x+i
print(x)