# 출처 : https://www.acmicpc.net/problem/1260

N, M, V = map(int, input().split())
matrix = [[0] * (N + 1) for _ in range(N + 1)]
for _ in range(M):
    index = list(map(int, input().split()))
    matrix[index[0]][index[1]] = 1
    matrix[index[1]][index[0]] = 1

def bfs(start):
    visited = [start]
    queue = [start]
    while queue:
        currentNode = queue.pop(0)
        for searchNode in range(len(matrix[start])):
            if matrix[currentNode][searchNode] == 1 and (searchNode not in visited):
                visited.append(searchNode)
                queue.append(searchNode)
    return visited

def dfs(start, visited):
    visited += [start]
    for searchNode in range(len(matrix[start])):
        if matrix[start][searchNode] == 1 and (searchNode not in visited):
            dfs(searchNode, visited)
    return visited

print(*dfs(V, []))
print(*bfs(V))
