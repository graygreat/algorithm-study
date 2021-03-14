# https://programmers.co.kr/learn/courses/30/lessons/12916

def solution(s):
    s = s.upper()
    count = 0
    for data in s:
        if data == 'P':
            count += 1
        elif data == 'Y':
            count -= 1
    if count == 0:
        return True
    else:
        return False

print(solution("pPoooyY"))