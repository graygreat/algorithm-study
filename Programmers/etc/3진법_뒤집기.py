# # https://programmers.co.kr/learn/courses/30/lessons/68935

def solution(n):
    answer = ''
    while n:
        answer += str(n % 3)
        n = n // 3

    result = int(answer, 3)
    return result 

print(solution(1))

# def solution(n):
#     tmp = ''
#     while n:
#         tmp += str(n % 3)
#         n = n // 3
#     print(tmp)
#     answer = int(tmp, 3)
#     return answer

# print(solution(45))