# https://www.acmicpc.net/problem/1260
from collections import deque

def dfs(graph, v, visited):
    visited[v] = True
    print(v, end = ' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

n, m, v = map(int, input().split())
data_set = [[] for _ in range(n + 1)]
for _ in range(m):
    a, b = map(int, input().split())
    data_set[a].append(b)
    data_set[b].append(a)

for i in range(1, n + 1):
    data_set[i].sort()

visited = [False] * (n + 1)
dfs(data_set, v, visited)
print()
visited = [False] * (n + 1)
bfs(data_set, v, visited)