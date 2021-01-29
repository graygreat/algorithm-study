# https://programmers.co.kr/learn/courses/30/lessons/60058

def find_balanced_index(data_set):
    count = 0
    for i in range(len(data_set)):
        if data_set[i] == '(':
            count += 1
        else:
            count -= 1
        if count == 0:
            return i

def proper_check(data_set):
    stack = []
    for data in data_set:
        if data == '(':
            stack.append(data)
        elif data ==')':
            if stack:
                stack.pop()
            else:
                return False
    return True

def reserve(data_set):
    array = []
    for data in data_set:
        if data == '(':
            array += ')'
        else:
            array += '('
    return array

def solution(p):
    answer = ''
    if p == '':
        return answer
        
    index = find_balanced_index(p)
    u = p[:index + 1]
    v = p[index + 1:]
    
    if proper_check(u):
        return u + solution(v)

    else:
        answer = '('
        answer += solution(v)
        answer += ')'
        u = reserve(u[1:-1])
        answer += "".join(u)        
    return answer

print(solution("()))((()"))
