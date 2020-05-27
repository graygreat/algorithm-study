def solution(heights):
    answer = []
    heights = list(reversed(heights))
    length = len(heights)
    for i in range(length):
        for j in range(i + 1, length):
            if(heights[i] < heights[j]):
                answer.append(length - j)
                break
            if(length == j + 1):
                answer.append(0)
    answer.append(0)
    answer = list(reversed(answer))
    return answer


heights = [1,5,3,6,7,6,5]

print(solution(heights))