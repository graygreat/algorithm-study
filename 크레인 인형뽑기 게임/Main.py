def solution(board, moves):
    tempArr = []
    answer = 0
    for i in range(len(moves)):
        for j in range(len(board)):
            if(board[j][moves[i] - 1] > 0):
                tempArr.append(board[j][moves[i] - 1])
                board[j][moves[i] - 1] = 0
                if(len(tempArr) >= 2 and tempArr[-1] == tempArr[-2]):
                    tempArr.pop()
                    tempArr.pop()
                    answer += 2
                break

    return answer

# board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
# moves = [1,5,3,5,1,2,1,4]
#
# print(solution(board, moves))

