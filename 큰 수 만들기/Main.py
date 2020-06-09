def solution(number, k):
    answer = ''
    length = len(number)
    maxIndex = 0
    j = k
    while(True):
        if (len(answer) == (length - k)):
            return str(''.join(answer))

        numberSlicing = number[maxIndex: j + 1]
        maxNum = max(numberSlicing)
        maxIndex += numberSlicing.index(maxNum) + 1
        answer += maxNum
        j = j + 1


number = "4177252841"
k = 4

print(solution(number, k))
