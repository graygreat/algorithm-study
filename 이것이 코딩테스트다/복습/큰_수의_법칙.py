# Greedy
n, m, k = map(int, input().split())

data_set = list(map(int, input().split()))
data_set.sort(reverse=True)
answer = 0

for i in range(1, m + 1):
    if i % (k + 1) == 0:
        answer += data_set[1]
        continue
    answer += data_set[0]

print(answer)
    