# Greedy
data_set = input()
result = int(data_set[0])

for i in range(1, len(data_set)):
    data = int(data_set[i])
    if data <= 1 or result <= 1:
        result += data
    else:
        result *= data

print(result)