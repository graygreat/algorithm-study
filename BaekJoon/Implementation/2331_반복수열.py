# https://www.acmicpc.net/problem/2331

a, p = map(int, input().split())
data_set = []
count = 0
while True:
    number_data = a
    data_set.append(number_data)

    sum_data = 0
    for data in str(number_data):
        sum_data += pow(int(data), p)
    
    if sum_data in data_set:
        index_data = sum_data
        break
    else:
        a = sum_data

print(data_set.index(index_data))