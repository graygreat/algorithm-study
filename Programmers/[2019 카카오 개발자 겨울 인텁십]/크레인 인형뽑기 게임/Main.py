from collections import deque

def solution(board, moves):
    length = len(board)
    storage = deque()
    previous = -1
    count = 0
    for move in moves:
        for i in range(length):
            doll = board[i][move - 1]
            if doll == 0:
                continue
            if previous == doll:
                storage.pop()
                count += 2
                previous = storage[-1]
                break
            if doll:
                storage.append(doll)
                board[i][move - 1] = 0
                previous = doll
                break
            previous = doll
    return count

board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves = [1,5,3,5,1,2,1,4]

print(solution(board, moves))

