print("Bem vindo a máquina de números perfeitos. Digite um número e descubra se é perfeito ou não:")
x = int(input())
cont = 1
soma = 0

while cont < x:
    if x%cont == 0:
        soma += cont
        cont += 1
    else:
        cont += 1
print("___________________________________________________________________________________________")

if soma == x:
    print(f'Parabéns, o número: {x} é perfeito!')
else:
    print(f'Infelizmente o número: {x} não é perfeito.')