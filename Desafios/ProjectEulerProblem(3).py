#Desafio 3: Largest prime factor
def decomp_fat_primo(x):
    fatores_primos = []
    num_divisor = 2
    while num_divisor <= x:
        if x%num_divisor == 0:
            fatores_primos.append(num_divisor)
            x = x/num_divisor 
        else:
            num_divisor += 1
    return fatores_primos.pop()

print("O último fator primo é: ")
print(decomp_fat_primo(600851475143))