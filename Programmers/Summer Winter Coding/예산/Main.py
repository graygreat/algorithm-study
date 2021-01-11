#출처 : https://programmers.co.kr/learn/courses/30/lessons/12982

def solution(d, budget):
    answer = 0
    sum = 0
    i = 0
    d = sorted(d)
    while sum < budget and i < len(d):
        sum += d[i]
        if sum > budget:
            return i
        i += 1
    answer = i

    return answer


