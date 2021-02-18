# https://www.acmicpc.net/problem/2522

n = int(input())

for i in range(1, n + 1):
    print(' ' * (n - i), end='')
    print('*' * i)
for i in range(1, n):
    print(' ' * i, end='')
    print('*' * (n - i))
