''' 틀린 내 풀이
def solution(food_times, k):
    index = 0
    count = 0
    result = 0
    length = len(food_times)
    while(True):
        if sum(food_times) == 0:
            return -1
        if food_times[index % length] > 0:
            count += 1
            food_times[index % length] -= 1
        if count == (k + 1):
            result = index % length + 1
            break
        index += 1
    return result
'''

# ndb
import heapq

def solution(food_times, k):
    if sum(food_times) <= k:
        return -1
    
    q = []
    for i in range(len(food_times)):
        heapq.heappush(q, (food_times[i], i + 1))
    
    sum_value = 0
    previous = 0
    length = len(food_times)

    while sum_value + ((q[0][0] - previous) * length) <= k:
        now = heapq.heappop(q)[0]
        sum_value += (now - previous) * length
        length -= 1
        previous = now
    
    result = sorted(q, key = lambda x : x[1])
    return result[(k - sum_value) % length][1]


# print(solution([3, 1, 2], 5))
# print(solution([4,2,3,6,7,1,5,8], 16))
# print(solution([4,2,3,6,7,1,5,8], 27))
print(solution([8, 6, 4], 15))
# food_times=[4,2,3,6,7,1,5,8] k=16 answer = 3
# food_times=[4,2,3,6,7,1,5,8] k=27 answer = 5