# 출처 : https://programmers.co.kr/learn/courses/30/lessons/42583
def solution(bridge_length, weight, truck_weights):
    time = 0
    bridge_queue = [0] * bridge_length
    sum_bridge_queue = 0
    while(bridge_queue):
        time += 1
        bqp = bridge_queue.pop(0)
        sum_bridge_queue -= bqp

        if truck_weights:
            if sum_bridge_queue + truck_weights[0] <= weight:
                twp = truck_weights.pop(0)
                sum_bridge_queue += twp
                bridge_queue.append(twp)
            else:
                bridge_queue.append(0)
    return time



print(solution(2, 10, [7, 4, 5, 6]))
# print(solution(100, 100, [10]))
# print(solution(1, 1, [1]))