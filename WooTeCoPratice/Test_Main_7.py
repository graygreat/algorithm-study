def solution(n, horizontal):
    answer = [[0] * n for i in range(n)]
    center = (n * n) // 2
    time = 0
    x = 0
    y = 0
    rightable = True
    for i in range(center):
        if (rightable):
            if (x == 0):
                if (y % 2 == 0):
                    y += 1
                    time += 1
                else:
                    x += 1
                    y -= 1
                    rightable = False
                    time += 2
            else:
                x -= 1
                y += 1
                time += 2
        else:
            if (y == 0):
                if (x % 2 == 1):
                    x += 1
                    time += 1
                else:
                    y += 1
                    x -= 1
                    rightable = True
                    time += 2
            else:
                y -= 1
                x += 1
                time += 2

        answer[x][y] = time
    if (n % 2 == 0):
        total = answer[n // 2 - 1][n // 2] * 2 + 2
        for i in range(n):
            for j in range(n):
                if (i + j == n):
                    break
                answer[n - i - 1][n - j - 1] = total - answer[i][j]
    else:
        total = answer[n // 2][n // 2] * 2
        for j in range(n):
            for i in range(n):
                if (i + j == n):
                    break
                answer[n - i - 1][n - j - 1] = total - answer[i][j]
    if (horizontal is False):
        for i in range(n):
            for j in range(n):
                if (i < j):
                    tmp = answer[i][j]
                    answer[i][j] = answer[j][i]
                    answer[j][i] = tmp
    return answer
