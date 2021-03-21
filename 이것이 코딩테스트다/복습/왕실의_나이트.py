# 구현

input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0])) - int(ord('a')) + 1
steps = [(-2, -1), (-2, 1), (-1, -2), (1, -2), (-1, 2), (1, 2), (2, -1), (2, 1)]
result = 0

for step in steps:
    nx = row + step[0]
    ny = column + step[1]

    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    result += 1

print(result)