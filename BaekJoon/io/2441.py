# https://www.acmicpc.net/problem/2441

n = int(input())

for i in range(n):
    for j in range(i):
        print(' ', end='')
    for j in range(i, n):
        print('*', end='')
    print()