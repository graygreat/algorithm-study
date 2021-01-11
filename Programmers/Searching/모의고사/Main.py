def solution(answers):
    answer = []
    count = [0, 0, 0]
    nOne = [1, 2, 3, 4, 5]
    nTwo = [2, 1, 2, 3, 2, 4, 2, 5]
    nThree = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    for i in range(len(answers)):
        if(answers[i] == nOne[i % len(nOne)]):
            count[0] += 1
        if (answers[i] == nTwo[i % len(nTwo)]):
            count[1] += 1
        if (answers[i] == nThree[i % len(nThree)]):
            count[2] += 1

    answer = [i + 1 for i, j in enumerate(count) if j == max(count)]

    return answer





