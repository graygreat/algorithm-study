# https://www.acmicpc.net/problem/11724
import sys
sys.setrecursionlimit(10000)

def dfs(graph, v, visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

n, m  = map(int, input().split())
data_set = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)
result = 0

for _ in range(m):
    u, v = map(int, input().split())
    data_set[u].append(v)
    data_set[v].append(u)

for i in range(1, n + 1):
    if not visited[i]:
        dfs(data_set, i, visited)
        result += 1

print(result)