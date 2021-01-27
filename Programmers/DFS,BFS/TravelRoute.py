# https://programmers.co.kr/learn/courses/30/lessons/43164
from collections import deque

def check(tickets, start):
    answer = []
    for i in range(len(tickets)):
        if tickets[i][0] == start:
            answer.append(tickets[i])
    result = sorted(answer, key = lambda x : x[1])
    if len(result) > 1:
        print(result)
        result.pop()
    # print(tickets)
    tickets.pop(tickets.index(result[0]))
    return result[0][1], tickets

def solution(tickets):
    start = "ICN"
    answer = [start]
    for _ in range(len(tickets)):
        start, tickets = check(tickets, start)
        answer.append(start)
    return answer

print(solution([['ICN','BOO' ], [ 'ICN', 'COO' ], [ 'COO', 'DOO' ], ['DOO', 'COO'], [ 'BOO', 'DOO'] ,['DOO', 'BOO'], ['BOO', 'ICN' ], ['COO', 'BOO']]))
# print(solution([["ICN", "SFO"], ["SFO", "ICN"], ["ICN", "SFO"],["SFO","QRE"]]))
# print(solution([["ICN", "A"], ["ICN", "A"], ["A", "ICN"]]))
# print(solution([['ICN', 'B'], ['B', 'C'], ['C', 'ICN'], ['ICN', 'D'], ['ICN', 'E'], ['E', 'F']]))
# print(solution([['ICN' ,'B'], ['ICN', 'C'] ,['C', 'D'], ['D', 'ICN']]))
# print(solution([["ICN", "A"], ["ICN", "A"], ["ICN", "A"], ["A", "ICN"], ["A", "ICN"]]))
# print(solution([["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]))
# print(solution([["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]]))