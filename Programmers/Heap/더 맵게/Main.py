import heapq

def solution(scoville, K):
    answer = 0

    heapq.heapify(scoville)

    while scoville[0] < K:
        if len(scoville) > 1:
            heapq.heappush(scoville, heapq.heappop(scoville) + (heapq.heappop(scoville) * 2))
            answer += 1
        else:
            return -1

    return answer

scoville = [1, 2, 3, 9, 10, 12]
k = 7

print(solution(scoville, k))