# baekjoon 10809

str = input()
i = 0
lst = [-1 for i in range(26)]

for i in range(len(str)):
    num = abs(97 - ord(str[i]))
    if(lst[num] == -1):
        lst[num] = i

for i in range(len(lst)):
    print(lst[i], end=' ')