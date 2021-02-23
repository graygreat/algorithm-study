# https://www.acmicpc.net/problem/10451

def dfs(graph, v, visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

t = int(input())

for _ in range(t):
    n = int(input())
    permutation_data = list(map(int, input().split()))
    data_set = [[] for _ in range(n + 1)]

    for i in range(n):
        data_set[i + 1].append(permutation_data[i])
        data_set[permutation_data[i]].append(i + 1)

    # print(data_set)
    visited = [False] * (n + 1)
    result = 0
    for i in range(1, n + 1):
        if not visited[i]:
            dfs(data_set, i, visited)
            result += 1
    print(result)