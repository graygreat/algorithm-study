# https://www.acmicpc.net/problem/10610

n = list(input())
n.sort(reverse=True)

n_data = int(''.join(n))
if n_data % 30 == 0:
    print(n_data)
else:
    print(-1)
