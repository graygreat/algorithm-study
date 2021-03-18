# https://programmers.co.kr/learn/courses/30/lessons/12926

def solution(s, n):
    s = list(s)
    answer = ''
    for data in s:
        if data.isalpha():
            ascii_data = ord(data) + n 
            if data.isupper():
                if ascii_data >= 91:
                    ascii_data -= 26
            else:
                if ascii_data >= 123:
                    ascii_data -= 26
            answer += chr(ascii_data)
        else:
            answer += ' '
    return answer

# print(solution("z", 1))
# print(solution("AB", 1))
print(solution("Z", 10))