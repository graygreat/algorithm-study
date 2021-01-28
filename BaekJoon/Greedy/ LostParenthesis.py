# https://www.acmicpc.net/problem/1541

# 내 소스
import re

data = input()
number_data = list(map(int, re.split("\W+", data)))
sign_data = re.split("\d+", data)[1:-1]

result = number_data[0]
temp_data = 0
sign = ''
for i in range(1, len(number_data)):
    if sign_data[i - 1] == '-':
        result -= number_data[i]
        sign = '-'
        continue
    if sign_data[i - 1] == '+' and sign == '-':
        result -= number_data[i]
        continue
    if sign_data[i - 1] == '+':
        result += number_data[i]
        continue

print(result)

''' 잘 짜진 소스
data_set = input().split('-')
sum_data = []
number_data = []

for data in data_set:
    number_data = list(map(int, data.split('+')))
    sum_data.append(sum(number_data))

result = sum_data[0]
for data in sum_data[1:]:
    result -= data
print(result)    
'''