# https://www.acmicpc.net/problem/1439

import sys
from collections import Counter

data_set = list(map(int, sys.stdin.readline().rstrip()))
count_0 = 0
count_1 = 0

if data_set[0] == 1:
    count_0 += 1
else:
    count_1 += 1

for i in range(len(data_set) - 1):
    if data_set[i] != data_set[i + 1]:
        if data_set[i + 1] == 1:
            count_0 += 1
        else:
            count_1 += 1

print(min(count_0, count_1))