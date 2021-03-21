# https://www.acmicpc.net/problem/18406
# 구현

n = input()
middle_length = len(n) // 2

left_data = sum(map(int, n[:middle_length]))
right_data = sum(map(int, n[middle_length:]))

if left_data == right_data:
    print("LUCKY")
else:
    print("READY")