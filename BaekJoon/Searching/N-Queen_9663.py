# https://www.acmicpc.net/problem/9663
import sys

n = int(sys.stdin.readline())
result = 0
column, upDiagonal, downDiagonal = [False] * n, [False] * (2 * n - 1), [False] * (2 * n - 1)

def solve(index):
    global result
    if index == n:
        result += 1
        return
    for i in range(n):
        if not (column[i] or upDiagonal[index + i] or downDiagonal[index - i + n - 1]):
            column[i] = upDiagonal[index + i] = downDiagonal[index - i + n - 1] = True
            solve(index + 1)
            column[i] = upDiagonal[index + i] = downDiagonal[index - i + n - 1] = False

solve(0)
print(result)