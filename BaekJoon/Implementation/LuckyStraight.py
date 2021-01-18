# https://www.acmicpc.net/problem/18406

n = list(map(int, input()))

if len(n) % 2 == 0:
    center_digit = len(n) // 2
    if sum(n[:center_digit]) ==  sum(n[center_digit:]):
        print("LUCKY")
    else:
        print("READY")
else:
    print("READY")
