# https://programmers.co.kr/learn/courses/30/lessons/12918

def solution(s):
    length = [4, 6]
    if len(s) in length and s.isdigit():
        return True
    return False
print(solution("a234"))
print(solution("1234"))