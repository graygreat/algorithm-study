# https://programmers.co.kr/learn/courses/30/lessons/60057

def solution(s):
    answer = len(s)
    center = answer // 2

    for i in range(1, center + 1):
        compressed = ""
        prev = s[:i]
        count = 1
        for j in range(i, len(s), i):
            if prev == s[j:j + i]:
                count += 1
            else:
                compressed += str(count) + prev if count >= 2 else prev
                prev = s[j:j + i]
                count = 1
        
        compressed += str(count) + prev if count >= 2 else prev
        answer = min(answer, len(compressed))
    
    return answer

print(solution("abcabcdede"))