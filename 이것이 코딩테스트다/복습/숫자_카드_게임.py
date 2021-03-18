# Greedy
n, m = map(int, input().split())
min_data = []

for i in range(n):
    data_set = list(map(int, input().split()))
    min_data.append(min(data_set))

print(max(min_data))