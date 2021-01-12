# https://www.acmicpc.net/problem/4963
import sys
sys.setrecursionlimit(100000)

dx = [-1, -1, -1, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 1, -1, 0, 1]

while(True):
    w, h = map(int, sys.stdin.readline().rstrip().split())
    if w == 0 and h == 0:
        break
    graph = []

    for _ in range(h):
        graph.append(list(map(int, sys.stdin.readline().rstrip().split())))

    def dfs(x, y):
        if x < 0 or y < 0 or x >= h or y >= w:
            return False
        if graph[x][y] == 1:
            graph[x][y] = 0
            for i in range(8):       
                nx = x + dx[i]
                ny = y + dy[i] 
                dfs(nx, ny)
            return True
        return False

    result = 0
    for i in range(h):
        for j in range(w):
            if dfs(i, j) == True:
                result += 1
    print(result)