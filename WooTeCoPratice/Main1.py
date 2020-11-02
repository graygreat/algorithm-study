money = int(input())

money_list = [50000, 10000, 5000, 1000, 500, 100, 50, 10, 1]
money_count = []
for i in range(len(money_list)):
    money_count.append(money // money_list[i])
    money = money % money_list[i]

print(money_count)
