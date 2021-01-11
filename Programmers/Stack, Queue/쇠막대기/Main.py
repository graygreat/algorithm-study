# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42585
def solution(arrangement):
    arrangement = list(arrangement)
    tempArr = []
    answer = 0

    while arrangement:
        if arrangement[0] == "(":
            tempArr.append(arrangement[0])
        else:
            if previous == "(":
                tempArr.pop()
                answer += len(tempArr)
            else:
                tempArr.pop()
                answer += 1
        previous = arrangement[0]
        arrangement.pop(0)
    return answer

print(solution("()(((()())(())()))(())"))