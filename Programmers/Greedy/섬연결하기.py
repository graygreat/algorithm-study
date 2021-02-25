# https://programmers.co.kr/learn/courses/30/lessons/42861

# Kruskal Algorithm

def solution(n, costs):
    answer = 0
    costs.sort(key = lambda x : x[2])   # 간선을 비용에 따라 오름차순 정렬
    visited = [False] * n
    visited[0] = True

    print(costs)
    while False in visited:
        for c in costs:
            start, end, cost = c
            if visited[start] or visited[end]:
                if visited[start] and visited[end]:
                    continue 
                else:
                    visited[start] = True
                    visited[end] = True
                    answer += cost
                    break
    return answer

print(solution(4, [[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]))