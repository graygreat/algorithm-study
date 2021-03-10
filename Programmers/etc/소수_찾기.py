# https://programmers.co.kr/learn/courses/30/lessons/12921

def solution(n):
    is_primes = [True] * (n + 1)

    m = int(n ** 0.5)
    for i in range(2, m + 1):
        if is_primes[i] == True:
            for j in range(i + i, n + 1, i):
                is_primes[j] = False
    
    return len([i for i in range(2, n + 1) if is_primes[i] == True])

print(solution(5))