def solution(heights):
    length = len(heights)
    answer = [0] * length
    heights = list(reversed(heights))

    for i in range(length):
        for j in range(i + 1, length):
            if(heights[i] < heights[j]):
                answer[i] = length - j
                break

    answer = list(reversed(answer))
    return answer


