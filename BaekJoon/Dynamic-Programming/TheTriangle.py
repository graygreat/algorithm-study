# https://www.acmicpc.net/problem/1932
import sys

n = int(sys.stdin.readline())
triangle_data = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

for i in range(n - 1, -1, -1):
    for j in range(len(triangle_data[i]) - 1):
        triangle_data[i - 1][j] += max(triangle_data[i][j], triangle_data[i][j + 1])

print(max(triangle_data)[0])