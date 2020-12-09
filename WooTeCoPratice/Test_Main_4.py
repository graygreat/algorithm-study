def solution(n, board):
    x1 = 0
    y1 = 0
    x2 = 0
    y2 = 0

    mid = n // 2
    answer = 0
    distance_x = 0
    distance_y = 0

    for item in range(1, n * n + 1):
        for i in range(n):
            for j in range(n):
                if (board[i][j] == item):
                    x2 = i
                    y2 = j

        distance_x = abs(x1 - x2)
        distance_y = abs(y1 - y2)

        if (distance_x > mid):
            distance_x -= mid

        if (distance_y > mid):
            distance_y -= mid

        answer += distance_x + distance_y + 1

        x1 = x2
        y1 = y2
        print(distance_x + distance_y + 1)

    return answer

