# https://www.acmicpc.net/problem/2440

n = int(input())

for i in range(n):
    for j in range(n - i):
        print('*', end='')
    print()