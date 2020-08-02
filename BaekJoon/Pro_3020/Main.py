# 출처 : https://www.acmicpc.net/problem/3020
import sys
bottom = []
top = []
countArr = []

N, H = map(int, sys.stdin.readline().split())
for i in range(N):
    num = int(sys.stdin.readline().rstrip())
    if i % 2 == 0:
        bottom.append(num)
    else:
        top.append(num)

for i in range(H):
    count = 0
    for j in range(N // 2):
        if bottom[j] >= i + 1:
            count += 1
        if H - top[j] <= i:
            count += 1
    countArr.append(count)

minNum = min(countArr)

print(minNum, countArr.count(minNum))
# print(bottom, top)
