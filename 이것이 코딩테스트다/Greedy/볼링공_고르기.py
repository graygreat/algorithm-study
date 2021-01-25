# 내 코드
n, m = map(int, input().split())
data_set = list(map(int, input().split()))
count = 0

for i in range(len(data_set) - 1):
    for j in range(i + 1, len(data_set)):
        if data_set[i] == data_set[j]:
            continue
        count += 1

print(count)


''' ndb code
n, m = map(int, input().split())
data_set = list(map(int, input().split()))

array = [0] * 11

for data in data_set:
    array[data] += 1

result = 0
for i in range(1, m + 1):
    n -= array[i]
    result += array[i] * n

print(result)
'''
