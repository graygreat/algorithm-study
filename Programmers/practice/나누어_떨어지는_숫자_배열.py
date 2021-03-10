# https://programmers.co.kr/learn/courses/30/lessons/12910

def solution(arr, divisor):
    answer = []
    for data in arr:
        if data % divisor == 0:
            answer.append(data)
    
    answer.sort()
    
    if len(answer) == 0:
        answer.append(-1)

    return answer

# print(solution([5, 9, 7, 10], 5))
print(solution([3, 2, 6], 10))