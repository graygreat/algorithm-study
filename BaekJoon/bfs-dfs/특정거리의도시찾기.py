# https://www.acmicpc.net/problem/18352
from collections import deque

n, m, k, x = map(int, input().split())
data_set = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)

for _ in range(m):
    a, b = map(int, input().split())
    data_set[a].append(b)

q = deque([x])
while q:
    now = q.popleft()
    for next_node in data_set[now]:
        if visited[next_node] == 0:
            visited[next_node] = visited[now] + 1
            q.append(next_node)

visited[x] = 0
check = False
for i in range(1, n + 1):
    if visited[i] == k:
        print(i)
        check = True

if check == False:
    print(-1)
