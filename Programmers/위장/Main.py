# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42578
def solution(clothes):
    answer = len(clothes)
    length = len(clothes)

    for _ in range(length):
        for i in range(1, length):
            if clothes[0][1] != clothes[i][1]:
                answer += 1
        clothes.pop(0)
        length -= 1
    return answer

print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))
