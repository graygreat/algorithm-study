# https://www.acmicpc.net/problem/10026
import sys
sys.setrecursionlimit(10 ** 6)

n = int(sys.stdin.readline())

grid = []
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

for _ in range(n):
    grid.append(list(sys.stdin.readline()))

cowArtGrid = [[''] * n for _ in range(n)]
for i in range(n):
    for j in range(n):
        if grid[i][j] == 'R' or grid[i][j] == 'G':
            cowArtGrid[i][j] = 'R'
        if grid[i][j] == 'B':
            cowArtGrid[i][j] = 'B'

def dfs(x, y, color, gridType):
    if x <= -1 or y <= -1 or x >= n or y >= n:
        return False
    if gridType[x][y] == color:
        gridType[x][y] = 'F'
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny, color, gridType)
        return True        
    return False

result = 0
cowArtResult = 0
for i in range(n):
    for j in range(n):
        if dfs(i, j, 'R', grid) == True:
            result += 1
        if dfs(i, j, 'G', grid) == True:
            result += 1
        if dfs(i, j, 'B', grid) == True:
            result += 1
        if dfs(i, j, 'R', cowArtGrid) == True:
            cowArtResult += 1
        if dfs(i, j, 'B', cowArtGrid) == True:
            cowArtResult += 1
       
print(result, cowArtResult)