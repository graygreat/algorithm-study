n = int(input())
data_set = list(map(int, input().split()))
data_set.sort()

result = 0
count = 0

for data in data_set:
    count += 1
    if count >= data:
        result += 1
        count = 0
print(result)