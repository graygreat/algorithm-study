# https://programmers.co.kr/learn/courses/30/lessons/12931?language=python3

def solution(n):
    answer = 0
    for data in str(n):
        answer += int(data)
    return answer

print(solution(123))