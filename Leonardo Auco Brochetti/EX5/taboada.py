print("Taboadas, escolha um número:")


x = int(input())
cont = 0
mult = 0


while cont <= 10:
    y = x * mult
    print(f'{x} X {mult} = {y}')
    mult += 1
    cont += 1