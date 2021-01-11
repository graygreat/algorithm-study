# 출처 : https://www.acmicpc.net/problem/1448

import sys
#######
#해결1#
#######
N = int(input())
arr = []

for _ in range(N):
    arr.append(int(sys.stdin.readline()))
arr.sort(reverse=True)

for i in range(len(arr) - 2):
    if arr[i + 1] + arr[i + 2] > arr[i]:
        print(arr[i] + arr[i + 1] + arr[i + 2])
        sys.exit()

print(-1)

#######
#해결2#
#######
N = int(input())
arr = []
result = 0

for _ in range(N):
    arr.append(int(sys.stdin.readline()))
arr.sort(reverse=True)

while(True):
    if arr[0] < (arr[1] + arr[2]):
        result = arr[0] + arr[1] + arr[2]
        break
    elif len(arr) > 3:
        arr.pop(0)
    else:
        result = -1
        break

print(result)