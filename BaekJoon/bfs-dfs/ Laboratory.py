# https://www.acmicpc.net/problem/14502
import sys

n, m = map(int, sys.stdin.readline().split())
data_set = []
temp = [[0] * m for _ in range(n)]

for _ in range(n):
    data_set.append(list(map(int, sys.stdin.readline().split())))

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def virus(x, y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx >= 0 and nx < n and ny >= 0 and ny < m:
            if temp[nx][ny] == 0:
                temp[nx][ny] = 2
                virus(nx, ny)

def safe_area():
    area_count = 0
    for i in range(n):
        for j in range(m):
            if temp[i][j] == 0:
                area_count += 1
    return area_count

result = 0

def dfs(count):
    global result
    if count == 3:
        for i in range(n):
            for j in range(m):
                temp[i][j] = data_set[i][j]
        for i in range(n):
            for j in range(m):
                if temp[i][j] == 2:
                    virus(i, j)
        result = max(result, safe_area())
        return
    
    for i in range(n):
        for j in range(m):
            if data_set[i][j] == 0:
                data_set[i][j] = 1
                count += 1
                dfs(count)
                data_set[i][j] = 0
                count -= 1

dfs(0)
print(result)
