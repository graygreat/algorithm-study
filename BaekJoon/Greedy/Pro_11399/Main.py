N = int(input())
S = sorted(map(int, input().split()))

result = 0
sum = 0

for i in range(0, len(S)):
    result = result + S[i]
    sum += result

print(sum)
