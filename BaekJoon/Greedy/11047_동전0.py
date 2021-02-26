# https://www.acmicpc.net/problem/11047

n, k = map(int, input().split())
coin_data = []
result = 0

for _ in range(n):
    coin_data.append(int(input()))

for i in range(n - 1, -1, -1):
    if coin_data[i] <= k: 
        result += k // coin_data[i]
        k = k % coin_data[i]

print(result)