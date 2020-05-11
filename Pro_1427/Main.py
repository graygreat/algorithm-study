n = input()

x = list(reversed(sorted(n)))

for i in range(0, len(x)):
    print(x[i], end='')