# https://www.acmicpc.net/problem/1924

weeks = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

x, y = map(int, input().split())
day = 0

for i in range(x - 1):
    day += days[i]
day = (day + y) % 7

print(weeks[day])