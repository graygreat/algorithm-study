# https://www.acmicpc.net/problem/18352
import sys
from collections import deque

n, m, k, x = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n + 1)]
distance = [-1] * (n + 1)
distance[x] = 0

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)

queue = deque([x])
while queue:
    v = queue.popleft()
    for i in graph[v]:
        if distance[i] == -1:
            queue.append(i)
            distance[i] = distance[v] + 1

check = False
for i in range(1, n + 1):
    if distance[i] == k:
        print(i)
        check = True

if check == False:
    print(-1)