# https://www.acmicpc.net/problem/1972
from collections import Counter

data = input()
while(data != '*'):
    n = len(data)
    flag = 1
    array = []
    for i in range(n - 1):
        for j in range(n - 1 - i):
            array.append(data[j] + data[j + i + 1])
        if max(list(Counter(array).values())) != 1:
            flag = 0
            break
        array.clear()
    if flag == 1:
        print(data + " is surprising.")
    else:
        print(data + " is NOT surprising.")
    data = input()
