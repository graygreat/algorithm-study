# https://programmers.co.kr/learn/courses/30/lessons/12906

def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in range(1, len(arr)):
        if arr[i] == arr[i - 1]:
            continue
        answer.append(arr[i])
    return answer

print(solution([1,1,3,3,0,1,1]))