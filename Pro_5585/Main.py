money = 1000 - int(input())

changeMoney = [500, 100, 50, 10, 5, 1]
count = 0

for i in range(len(changeMoney)):
    if(money == 0):
        break
    if(money / changeMoney[i] >= 1):
        count += money // changeMoney[i]
        money = money % changeMoney[i]


print(count)