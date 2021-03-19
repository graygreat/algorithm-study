# https://www.acmicpc.net/problem/14888

import sys
from itertools import permutations
input = sys.stdin.readline

n = int(input())
a_list = list(map(int, input().split()))
sign_list = list(map(int, input().split()))
max_value, min_value= -1000000000, 10000000000
operation_list = []

for i in range(len(sign_list)):
    operation_list += [i + 1] * sign_list[i]

for operation in list(set(permutations(operation_list))):
    result = a_list[0]
    
    for i in range(1, n):
        if operation[i - 1] == 1:
            result += a_list[i]
        elif operation[i - 1] == 2:
            result -= a_list[i]
        elif operation[i - 1] == 3:
            result *= a_list[i]
        elif operation[i - 1] == 4:
            if result < 0:
                result = -(-result // a_list[i])
            else:
                result //= a_list[i]
    if result > max_value:
        max_value = result
    if result < min_value:
        min_value = result

print(max_value)
print(min_value)
