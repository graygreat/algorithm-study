# 이것이 코딩 테스트다 with 파이썬 p.92
# 내 풀이

import sys

N, M, K = map(int, sys.stdin.readline().split())
numbers = list(map(int, sys.stdin.readline().split()))

numbers.sort(reverse=True)

result = 0

for i in range(M):
    if i > 0 and i % K == 0:
        result += numbers[1]
        continue
    result += numbers[0]

print(result)