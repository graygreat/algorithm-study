# https://programmers.co.kr/learn/courses/30/lessons/42842?language=python3

def solution(brown, yellow):
    answer = []
    for i in range(1, int(yellow ** 0.5) + 1):
        if yellow % i == 0:
            left = yellow // i + 2
        right = i + 2
        if brown == (left * right) - yellow:
            answer += [left, right]
            break
    return answer

# print(solution(10, 2))
print(solution(8, 1))
print(solution(24, 24))