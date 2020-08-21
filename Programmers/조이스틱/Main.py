# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42860

# print(ord('N'))
def solution(name):
    answer = 0
    for i in range(len(name)):
        if name[i] == 'A':
            continue
        if ord(name[i]) < 78:
            answer += ord(name[i]) - ord('A')
        else:
            answer += ord('Z') - ord(name[i]) + 1
        if i != (len(name) - 1):
            answer += 1
        print(answer)
    return answer

print(solution("AAB"))