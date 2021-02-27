n, m, e = map(int, input().split())
data_set = list(map(int, input().split()))

distanceList = []
start = -1
last = -1

for i in range(len(data_set)-1):
    first = data_set[i]
    second = data_set[i+1]
    if second < e or e < first:
        distance = second - first
        distanceList.append(distance)
    else:
        start = i - m +1
        distanceList.append(e - first)
        last = i + m - 1
        distanceList.append(second - e)


if start < 0:
    start = 0
if last == -1:
    last = start + m
if last > n-1:
    last = n-1

answer = n
for i in range(start, last+1):
    distance = sum(distanceList[i:i+m+1])
    if distance < answer:
        answer = distance
print(answer)