n = int(input())
food_count = list(map(int, input().split()))

""" 내 풀이 
d = [0] * n

d[0] = food_count[0]
d[1] = food_count[1]

for i in range(2, n):
    for j in range(0, i - 1):
        if d[i] < food_count[i] + d[j]:
            d[i] = food_count[i] + d[j]
    
# print(d)
print(max(d))
"""
# 나동빈 씨 풀이
d = [0] * 100

d[0] = food_count[0]
d[1] = max(food_count[0], food_count[1])
for i in range(2, n):
    d[i] = max(d[i - 1], d[i - 2] + food_count[i])

print(d[n - 1])
