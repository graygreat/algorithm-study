# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42746

def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key = lambda x : x*3, reverse=True)
    answer = str(int(''.join(numbers)))
    return answer
