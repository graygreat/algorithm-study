# https://www.acmicpc.net/problem/5557

n = int(input())
data_set = list(map(int, input().split()))
dp = [[0] * 21 for _ in range(n)]

dp[0][data_set[0]] = 1

for i in range(1, n - 1):
    for j in range(21):
        if dp[i - 1][j]:
            if 0 <= j + data_set[i] <= 20:
                dp[i][j + data_set[i]] += dp[i - 1][j]
            if 0 <= j - data_set[i] <= 20:
                dp[i][j - data_set[i]] += dp[i - 1][j]
print(dp[n - 2][data_set[-1]])