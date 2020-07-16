# 출처 : https://www.acmicpc.net/problem/1448

N = int(input())
arr = []
result = 0

for _ in range(N):
    arr.append(int(input()))
arr.sort(reverse=True)
a = max(arr)

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