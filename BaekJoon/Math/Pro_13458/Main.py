# 출처 : https://www.acmicpc.net/problem/13458
import math
import sys


N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
B, C = map(int, sys.stdin.readline().split())

count = N

for a in A:
    temp = a - B
    if temp < 0:
        continue
    count += math.ceil(temp / C)

print(count)
