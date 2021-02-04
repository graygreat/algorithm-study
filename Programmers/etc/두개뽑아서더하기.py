# https://programmers.co.kr/learn/courses/30/lessons/68644
from itertools import combinations

def solution(numbers):
    answer = []
    array = list(combinations(numbers, 2))
    for i in range(len(array)):
        answer.append(sum(array[i]))
    # print(array)
    return sorted(list(set(answer)))

print(solution([2,1,3,4,1]))