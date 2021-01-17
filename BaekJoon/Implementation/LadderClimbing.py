#https://www.acmicpc.net/problem/2469
import string, sys

def swap(a, i):
    temp = a[i]
    a[i] = a[i + 1]
    a[i + 1] = temp

k = int(sys.stdin.readline())
n = int(sys.stdin.readline())
order_result = list(map(str, sys.stdin.readline().rstrip()))
alphabet = list(string.ascii_uppercase[:k])

ladder_array = []
for i in range(n):
    ladder_array.append(list(map(str, sys.stdin.readline().rstrip())))
    if ladder_array[i][0] == '?':
        break

up_ladder_length = len(ladder_array)
for i in range(up_ladder_length - 1):
    for j in range(k - 1):
        if ladder_array[i][j] == '-':
            swap(alphabet, j)

for i in range(n - up_ladder_length):
    ladder_array.append(list(map(str, sys.stdin.readline().rstrip())))

for i in range(len(ladder_array) - 1, up_ladder_length - 1, -1):
    for j in range(k - 1):
        if ladder_array[i][j] == '-':
            swap(order_result, j)

result = ""
for i in range(k - 1):
    if alphabet[i] == order_result[i]:
        result += '*'
    elif alphabet[i] == order_result[i + 1]:
        result += '-'
        swap(alphabet, i)
    else:
        result = 'x' * (k - 1)
        break  
print(result)
