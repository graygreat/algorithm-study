# https://programmers.co.kr/learn/courses/30/lessons/12919

def solution(seoul):
    index = -1
    for i in range(len(seoul)):
        if seoul[i] == "Kim":
            index = i
    return "김서방은 " + str(index) + "에 있다"

print(solution(["Jane", "Kim"]))