import sys

N = int(input())

S = [0] * 10001

for i in range(N):
    INum = int(sys.stdin.readline())
    S[INum] = S[INum] + 1

for i in range(len(S)):
    if(S[i] != 0):
        for j in range(S[i]):
            print(i)

