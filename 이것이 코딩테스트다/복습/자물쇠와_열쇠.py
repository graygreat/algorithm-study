# https://programmers.co.kr/learn/courses/30/lessons/60059
# 구현

def rotation_graph(key):
    length = len(key)
    graph = [[0] * length for _ in range(length)]

    for i in range(length):
        for j in range(length):
            graph[j][length - 1 - i] = key[i][j]
    
    return graph

def check(lock):
    length = len(lock) // 3
    for i in range(length):
        for j in range(length):
            if lock[length + i][length + j] != 1:
                return False
    return True

def solution(key, lock):
    lock_length = len(lock)
    key_length = len(key)
    lock_expansion_graph = [[0] * lock_length * 3 for _ in range(lock_length * 3)]
    
    for i in range(lock_length):
        for j in range(lock_length):
            lock_expansion_graph[lock_length + i][lock_length + j] = lock[i][j]

    for _ in range(4):
        key = rotation_graph(key)
        for x in range(lock_length * 2):
            for y in range(lock_length * 2):
                for i in range(key_length):
                    for j in range(key_length):
                        lock_expansion_graph[x + i][y + j] += key[i][j]
                if check(lock_expansion_graph) == True:
                    return True
                
                for i in range(key_length):
                    for j in range(key_length):
                        lock_expansion_graph[x + i][y + j] -= key[i][j]
    return False

print(solution([[0, 0, 0], [1, 0, 0], [0, 1, 1]], [[1, 1, 1], [1, 1, 0], [1, 0, 1]]))
