import sys

input_data = sys.stdin.readline()
x = int(input_data[1])
y = int(ord(input_data[0])) - int(ord('a')) + 1
count = 0
print(x, y)
steps = [(-2, 1), (-2, -1), (-1, 2), (1, 2), (2, 1), (2, -1), (-1, -2), (1, -2)]

for step in steps:
    nx = x + step[0]
    ny = y + step[1]

    print(nx, ny)
    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    count += 1

print(count)

