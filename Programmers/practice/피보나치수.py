# https://programmers.co.kr/learn/courses/30/lessons/12945

def solution(n):
    data_set = [0] * (n + 1)
    data_set[1] = 1

    for i in range(2, n + 1):
        data_set[i] = data_set[i - 1] + data_set[i - 2]

    return data_set[n] % 1234567

print(solution(7))