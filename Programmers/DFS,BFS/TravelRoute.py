# https://programmers.co.kr/learn/courses/30/lessons/43164
from collections import deque

def solution(tickets):
    answer = []

    def dfs(start, used_ticket):
        for i in range(len(tickets)):
            if tickets[i][0] == start and i not in used_ticket:
                used_ticket.append(i)
                print(tickets[i][1])
                dfs(tickets[i][1], used_ticket)
                if len(tickets) == len(used_ticket):
                    return
                else:
                    used_ticket.pop()

    tickets = sorted(tickets, key = lambda x : (x[0], x[1]))
    used_ticket = []
    dfs("ICN", used_ticket)

    answer = ["ICN"]
    for ticket in used_ticket:
        answer.append(tickets[ticket][1])

    return answer
'''
def check(tickets, start):
    answer = []
    for i in range(len(tickets)):
        if tickets[i][0] == start:
            answer.append(tickets[i])
    result = sorted(answer, key = lambda x : x[1])
    print(result)
    if len(result) > 1:
        result.pop()
    tickets.pop(tickets.index(result[0]))
    return result[0][1], tickets

def solution(tickets):
    start = "ICN"
    answer = [start]
    for _ in range(len(tickets)):
        start, tickets = check(tickets, start)
        answer.append(start)
    return answer
'''
print(solution([['ICN','BOO' ], [ 'ICN', 'COO' ], [ 'COO', 'DOO' ], ['DOO', 'COO'], [ 'BOO', 'DOO'] ,['DOO', 'BOO'], ['BOO', 'ICN' ], ['COO', 'BOO']]))
# print(solution([["ICN", "SFO"], ["SFO", "ICN"], ["ICN", "SFO"],["SFO","QRE"]]))
# print(solution([["ICN", "A"], ["ICN", "A"], ["A", "ICN"]]))
# print(solution([['ICN', 'B'], ['B', 'C'], ['C', 'ICN'], ['ICN', 'D'], ['ICN', 'E'], ['E', 'F']]))
# print(solution([['ICN' ,'B'], ['ICN', 'C'] ,['C', 'D'], ['D', 'ICN']]))
# print(solution([["ICN", "A"], ["ICN", "A"], ["ICN", "A"], ["A", "ICN"], ["A", "ICN"]]))
# print(solution([["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]))
# print(solution([["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]]))