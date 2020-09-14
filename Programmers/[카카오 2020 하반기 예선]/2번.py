from collections import Counter
from itertools import combinations
from itertools import permutations
def findWord(word, num):
    wordArr = []
    length = len(word)
    wordArr = list(permutations(word, num))
    wordArr = [''.join(arr) for arr in wordArr]
    return wordArr

def solution(orders, course):
    wordList = []
    resultList = []
    for i in range(len(course)):
        for j in range(len(orders)):
            wordList.append(findWord(orders[j], course[i]))
        print(wordList)
        maxNum = Counter(sum(wordList, [])).most_common()[0][1]
        print(Counter(sum(wordList, [])).most_common()[0])
        length = len(Counter(sum(wordList, [])).most_common())
        if length == 1:
            continue
        for k in range(length):
            if Counter(sum(wordList, [])).most_common()[k][1] == maxNum:
                resultList.append(Counter(sum(wordList, [])).most_common()[k][0])
        wordList = []
    return sorted(resultList)



# print(solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"], [2, 3, 4]))
# print(solution(["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"], [2, 3, 5]))
print(solution(["XYZ", "XWY", "WXA"], [2, 3, 4]))