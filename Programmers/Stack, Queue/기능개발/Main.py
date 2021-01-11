# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42586
from collections import Counter

def solution(progresses, speeds):
    answer = ''
    newProgresses = []
    dayBySpeeds = []

    for num in progresses:
        newProgresses.append(100 - num)

    for i in range(len(newProgresses)):
        dayResult = newProgresses[i] // speeds[i]
        if((i > 0 and dayBySpeeds[-1] >= dayResult)):
            dayResult = dayBySpeeds[-1]
        dayBySpeeds.append(dayResult)

    answer = list(Counter(dayBySpeeds).values())

    return answer


print(solution([93,30,55], [1,30,5]))



