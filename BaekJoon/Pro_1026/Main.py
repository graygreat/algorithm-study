def mul(a, b, n):
    sum = 0
    for i in range(0, n):
        sum += a[i] * b[i]
    return sum


N = int(input())

A = list(map(int, input().split()))
B = list(map(int, input().split()))

A = list(reversed(sorted(A)))
B = list(sorted(B))

print(mul(A, B, N))
