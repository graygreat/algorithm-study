import sys

n, m = map(int, sys.stdin.readline().split())

data_set = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
d = [[0] * m for _ in range(n)]
d[0][0] = data_set[0][0]
nx = ny = 0
dx = [1, 0, 1]
dy = [0, 1, 1]

for i in range(n):
    for j in range(m):
        for k in range(3):
            nx = i + dx[k]
            ny = j + dy[k] 
            if nx < 0  or ny < 0 or nx >= n or ny >= m:
                continue
            if d[nx][ny] <= d[i][j] + data_set[nx][ny]: 
                d[nx][ny] = d[i][j] + data_set[nx][ny]

print(max(d)[m - 1])   
        