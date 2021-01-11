# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42885
def solution(people, limit):
    people.sort()
    answer = 0
    minIndex = 0
    maxIndex = len(people) - 1
    while minIndex <= maxIndex:
        answer += 1
        if people[minIndex] + people[maxIndex] <= limit:
            minIndex += 1
        maxIndex -= 1
    return answer