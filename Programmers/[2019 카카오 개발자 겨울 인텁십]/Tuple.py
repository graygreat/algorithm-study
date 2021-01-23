import re
from collections import Counter

#내 풀이
def solution(s):
    numbers = re.findall("\d+", s)
    answer = []
    count = Counter(numbers).most_common()
    for i in range(len(count)):
        answer.append(count[i][0])

    return list(map(int, answer))


''' 감탄 나오는 파이썬 다운 풀이
def solution(s):
    numbers = Counter(re.findall("\d+", s))

    return list(map(int, [k for k, v in sorted(numbers.items(),
    key = lambda x : x[1], reverse = True)]))
'''

# print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
# print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))
print(solution("{{20,111},{111}}"))