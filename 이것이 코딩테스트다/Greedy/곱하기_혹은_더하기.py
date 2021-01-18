import sys

data_set = list(map(int, sys.stdin.readline().rstrip()))
result = int(data_set[0])

for i in range(1, len(data_set)):
    data = int(data_set[i])
    if data <= 1 or result <= 1:
        result += data
        continue
    result *= data

print(result)