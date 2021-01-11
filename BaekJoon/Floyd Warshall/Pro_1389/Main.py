N, M = map(int, input().split())

INF = 100000000
kevinMap = [[INF for _ in range(N)] for _ in range(N)]

for _ in range(M):
    A, B = map(int, input().split())
    kevinMap[A - 1][B - 1] = 1
    kevinMap[B - 1][A - 1] = 1

for k in range(N):
    for i in range(N):
        for j in range(N):
            if(kevinMap[i][k] + kevinMap[k][j] < kevinMap[i][j]):
                kevinMap[i][j] = kevinMap[i][k] + kevinMap[k][j]

result = []
for i in kevinMap:
    result.append(sum(i))

print(result.index(min(result)) + 1)