# 이것이 코딩 테스트다 with 파이썬 p.96
# 내 풀이
import sys

n, m = map(int, sys.stdin.readline().split())
cards = []

min_result = 0

for _ in range(n):
    cards = list(map(int, sys.stdin.readline().split()))
    min_num = min(cards)
    min_result = max(min_result, min_num)
    
print(min_result)
