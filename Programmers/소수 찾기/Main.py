# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42839
from itertools import combinations
import math
def check(n):
    k = math.sqrt(n)
    if n < 2:
        return False

    for i in range(2, int(k) + 1):
        if n % i == 0:
            return False
    return True


def solution(numbers):
    arr = []
    comArr = []
    for i in range(1, len(numbers) + 1):
        arr.append(list(map(''.join, combinations(numbers, i))))

    for i in range(len(arr)):
        comArr += arr[i]
    return comArr

print(solution("011"))