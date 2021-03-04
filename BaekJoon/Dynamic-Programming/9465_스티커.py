# https://www.acmicpc.net/problem/9465
import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n = int(input())
    data_set = []
    data_set.append(list(map(int, input().split())))
    data_set.append(list(map(int, input().split())))

    data_set[0][1] += data_set[1][0]
    data_set[1][1] += data_set[0][0]

    for i in range(2, n):
        data_set[0][i] += max(data_set[1][i - 2], data_set[1][i - 1])
        data_set[1][i] += max(data_set[0][i - 2], data_set[0][i - 1])

    print(max(data_set[0][-1], data_set[1][-1]))    
