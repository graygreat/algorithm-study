# https://www.acmicpc.net/problem/11721

data = input()
length = len(data) // 10

for i in range(length + 1):
    print(data[i * 10 : i * 10 + 10])