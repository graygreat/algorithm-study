# https://programmers.co.kr/learn/courses/30/lessons/12900

def solution(n):
    data = [0 for _ in range(n + 1)]
    data[1] = 1
    data[2] = 2
    for i in range(3, n + 1):
        data[i] = (data[i - 1] + data[i - 2]) % 1000000007
    return data[n]
    
print(solution(5))