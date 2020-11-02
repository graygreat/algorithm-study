# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42842

def solution(brown, yellow):
    for a in range(1, int(yellow * 0.5) + 1):
        if not yellow % a:
            b = yellow // a
            if 2 * a + 2 * b + 4 == brown:
                return [b + 2, a + 2]

print(solution(7, 1))