#https://programmers.co.kr/learn/courses/30/lessons/60057

def solution(s):
    count = 0
    for i in range(1, (len(s) // 2) + 1):
        start = s[:i]
        for j in range(i, len(s)):
            if start == s[j:j + i]:
                count +=  i + 1
    return 0