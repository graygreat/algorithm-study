# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42860

def solution(name):
    answer = 0
    for i in range(len(name)):
        if ord(name[i]) == 65:
            answer -= 1
        if ord(name[i]) > 78:
            answer += (90 - ord(name[i]) + 1)
        else:
            answer += (ord(name[i]) - 65)
        # print(i, answer)
    return answer + len(name) - 1
print(solution("JANA"))