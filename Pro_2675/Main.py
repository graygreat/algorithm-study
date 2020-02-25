# BaekJoon 2675

def test(r, s):
    result = ''
    for i in range(0, len(s)):
        result += s[i] * r
    return result

n = int(input())

for i in range(0, n):
    r, s = input().split()
    r = int(r)
    print(test(r, s))

