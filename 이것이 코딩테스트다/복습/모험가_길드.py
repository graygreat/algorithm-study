# Greedy
n = int(input())
data_set = list(map(int, input().split()))
data_set.sort(reverse=True)

count = 1
max_data = data_set[0]

while True:
    if max_data == n:
        break
    if max_data > n:
        count -= 1
        break
    max_data += data_set[max_data]
    count += 1

print(count)