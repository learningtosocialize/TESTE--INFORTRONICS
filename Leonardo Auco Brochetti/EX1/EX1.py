x = []

print("Bem vindo a sua lista de números, selecione: 0 - sair e 1 - começar.")

a = int(input())
while a == 1:
    print("Digite um número: ")
    b = int(input())
    x.append(b)
    print("_________________________________________________________________________________________________________________________________________")
    print("Deseja continuar? 0 - Não e 1 - Sim: ")
    a = int(input())

y = sorted(x)
print(f'os numeros digitados foram: {y}')