# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42578
import collections
def solution(clothes):
    clothes = dict(clothes)
    answer = 1
    arr = list(collections.Counter(clothes.values()).values())

    for key in arr:
        answer *= key + 1

    return answer - 1

print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))
print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))