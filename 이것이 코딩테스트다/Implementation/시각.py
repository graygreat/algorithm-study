import sys

n = int(sys.stdin.readline())
count = 0
sumStr = ''
for i in range(0, n + 1):
    for j in range(0, 60):
        for k in range(0, 60):
            sumStr = str(i) + str(j) + str(k)
            if '3' in sumStr:
                count += 1

print(count)