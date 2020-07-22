# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42839
from itertools import permutations
import math

def check(num):
    n = math.sqrt(num)

    if n < 2:
        return False

    for i in range(2, int(n) + 1):
        if num % i == 0:
            return False
    return True
def solution(numbers):
    answer = []
    for i in range(1, len(numbers) + 1):
        arr = list(map(''.join, permutations(numbers, i)))
        for j in list(set(arr)):
            if(check(int(j))):
                answer.append(int(j))
    answer = len(set(answer))

    return answer

print(solution("011"))