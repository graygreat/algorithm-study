# https://www.acmicpc.net/problem/1912
import sys

n = int(sys.stdin.readline())
data_set = list(map(int, sys.stdin.readline().split()))

init_data = [0] * n
init_data[0] = max_data = data_set[0]

for i in range(1, n):
    data = init_data[i - 1] + data_set[i]
    if data < 0:
        init_data[i] = data
    if data > data_set[i]:
        init_data[i] = data
        max_data = data
    else:
        init_data[i] = data_set[i]
print(max(init_data))
    


