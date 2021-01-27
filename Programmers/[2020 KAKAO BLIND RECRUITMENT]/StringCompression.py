#https://programmers.co.kr/learn/courses/30/lessons/60057

def solution(s):
    answer = len(s)
    for step in range(1, (len(s) // 2) + 1):
        compressed = ""
        previous = s[0:step]
        count = 1
        for j in range(step, len(s), step):
            if previous == s[j:j + step]:
                count += 1
            else:
                compressed += str(count) + previous if count >= 2 else previous
                previous = s[j:j + step]
                count = 1
        compressed += str(count) + previous if count >= 2 else previous
        answer = min(len(compressed), answer)
    return answer

print(solution("aabbaccc"))