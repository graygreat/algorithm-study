# 출처 : https://www.acmicpc.net/problem/3020
import sys

N, H = map(int, sys.stdin.readline().split())
bottom = [0] * (H + 1)
top = [0] * (H + 1)
countArr = []

for i in range(N):
    num = int(sys.stdin.readline().rstrip())
    if i % 2 == 0:
        bottom[num] += 1
    else:
        top[H - num + 1] += 1

# bottom total
for i in range(H, 0, -1):
    bottom[i - 1] += bottom[i]

# top total
for i in range(2, H + 1):
    top[i] += top[i - 1]

for i in range(H + 1):
    countArr.append(bottom[i] + top[i])

countArr = countArr[1:]
mimArr = min(countArr)
print(mimArr, countArr.count(mimArr))
