# https://programmers.co.kr/skill_checks/242735
# 에라토스네스 체

def solution(n):
    array = [True for _ in range(n + 1)]

    for i in range(2, int(n ** 0.5) + 1):
        if array[i] == True:
            j = 2 
            while i * j  <= n:
                array[i * j] = False
                j += 1
    return len([i for i in range(2, n + 1) if array[i]])


print(len(solution(1000001)))
