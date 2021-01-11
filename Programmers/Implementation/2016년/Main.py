#출처 : https://programmers.co.kr/learn/courses/30/lessons/12901
def solution(a, b):
    sum = 0
    answer = ''
    day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    endDay = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    for i in range(a - 1):
        sum += endDay[i]

    answer = day[(sum + b - 1) % 7]
    return answer


print(solution(12, 31))