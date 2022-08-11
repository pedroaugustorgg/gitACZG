#Desafio 2: Even Fibonacci numbers
resultado = 0
x = 1
y = 1
z = 0

while z <= 4000000:
    if z % 2 == 0:
        resultado += z
    x = y
    y = z
    z = x + y

print(resultado)