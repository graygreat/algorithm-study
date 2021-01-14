import sys

n = int(sys.stdin.readline())

plans = list(map(str, sys.stdin.readline().rstrip().split(' ')))
x = y = nx = ny = 0
print(plans)
dx = [0, 0, 1, -1]
dy = [-1, 1, 0, 0]
locationTypes = ["L", "R", "D", "U"]

for plan in plans:
    for lt in range(len(locationTypes)):
        if locationTypes[lt] == plan:
            nx = x + dx[lt]
            ny = y + dy[lt]
    if nx < 0 or ny < 0 or nx >= n or ny >= n:
        continue
    
    print(x, y)
    x, y = nx, ny

print(x + 1, y + 1)