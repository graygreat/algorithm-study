# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42747

def solution(citations):
    answer = 0
    for i in range(1, len(citations) + 1):
        count = 0
        for j in citations:
            if i <= j:
                count += 1
            if i == count:
                answer = i
                break
    return answer

print(solution([3, 0, 6, 1, 5]))