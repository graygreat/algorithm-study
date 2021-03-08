# https://programmers.co.kr/learn/courses/30/lessons/12903

def solution(s):
    length = len(s) // 2
    if len(s) % 2 == 0:
        return s[length - 1 : length + 1]
    return s[length]

print(solution("abcde"))
# print(solution("qwer"))