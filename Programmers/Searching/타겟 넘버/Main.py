# 출처 : https://programmers.co.kr/learn/courses/30/lessons/43165

answer = 0
def solution(numbers, target):
    global answer
    
    numberLength = len(numbers) 

    def dfs(length, value):
        global answer
        if length == numberLength:
            if target == value:
                answer += 1
                return
            return
        dfs(length + 1, value + numbers[length])
        dfs(length + 1, value - numbers[length])

    dfs(0, 0)
    return answer

print(solution([1, 1, 1, 1, 1], 3))