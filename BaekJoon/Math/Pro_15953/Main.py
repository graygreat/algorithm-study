T = int(input())

firstFest = {1 : 5000000, 3 : 3000000, 6 : 2000000, 10 : 500000, 15 : 300000, 21 : 100000}
secondFest = {1: 5120000, 3 : 2560000, 7 : 1280000, 15 : 640000, 31 : 320000}

rankMoney = []

for _ in range(T):
    rankA, rankB = map(int, input().split())
    sum = 0
    if(rankA > 0):
        for key in firstFest.keys():
            if(rankA <= key):
                sum += firstFest[key]
                break
    if(rankB > 0):
        for key in secondFest.keys():
            if(rankB <= key):
                sum += secondFest[key]
                break
    rankMoney.append(sum)

print("\n".join(map(str, rankMoney)))
