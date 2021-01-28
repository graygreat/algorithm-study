# https://programmers.co.kr/learn/courses/30/lessons/72411
from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer = []
    for c in course:
        array = []
        for order in orders:
            combination = list(combinations(sorted(order), c))      #order를 정렬하여 조합
            array += combination
        count_list = Counter(array)                                 #중복된 menu count
        if len(count_list) > 1 and max(count_list.values()) > 1:
            for count in count_list:
                if count_list[count] == max(count_list.values()):   #menu 조합의 개수와 menu 조합 중 가장 많이 나온 값의 개수 비교
                    answer.append(''.join(count))
    return sorted(answer) 

print(solution(["ABCFG",  "CDE", "AC", "ACDE", "BCFG", "ACDEH"], [2,3,4]))
# print(solution(["XYZ", "XWY", "WXA"], [2, 3, 4]))