# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42584

def solution(prices):
    length = len(prices)
    answer = [1 for _ in range(length - 1)]
    answer.append(0)

    for i in range(length):
        for j in range(i + 1, length - 1):
            if prices[i] <= prices[j]:
                answer[i] += 1
            else:
                break

    return answer



