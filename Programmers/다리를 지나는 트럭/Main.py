# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42583
def solution(bridge_length, weight, truck_weights):
    time = 0
    bridge_queue = [0] * bridge_length

    while(True):
        time += 1
        bridge_queue.pop(0)

        if truck_weights and (sum(bridge_queue) + truck_weights[0] <= weight):
            bridge_queue.append(truck_weights.pop(0))
        else:
            bridge_queue.append(0)
        if sum(bridge_queue) == 0:
            return time


# print(solution(2, 10, [7, 4, 5, 6]))
print(solution(100, 100, [10]))