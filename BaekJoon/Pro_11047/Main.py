N, K = map(int, input().split())

C = [int(input()) for _ in range(N)]
C = list(reversed(C))
count = 0

for i in range(len(C)):
    if(K >= C[i]):
        count += K // C[i]
        K -= (C[i] * (K // C[i]))

print(count)