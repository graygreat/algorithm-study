# 출처 : https://www.acmicpc.net/problem/13458
import math
N = int(input())
A = list(map(int, input().split()))
B, C = map(int, input().split())

count = N

for a in A:
    temp = a - B
    count += math.ceil(temp / C)

print(count)
