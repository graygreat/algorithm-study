# https://programmers.co.kr/learn/courses/30/lessons/62048
import math
def solution(w,h):
    return w * h - (w + h - math.gcd(w, h))

print(solution(8, 12))
print(solution(5, 3))