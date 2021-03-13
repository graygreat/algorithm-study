n, m = map(int, input().split())
data_set = list(map(int, input().split()))
count = 0

for i in range(n - 1):
    for j in range(i + 1, n):
        if data_set[i] != data_set[j]:
            count += 1

print(count)