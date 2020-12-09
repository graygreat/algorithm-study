def solution(grades, weights, threshold):
    result = 0
    grade = 0
    for i in range(len(grades)):
        if grades[i] == 'A+':
            grade = 10
        elif grades[i] == 'A0':
            grade = 9
        elif grades[i] == 'B+':
            grade = 8
        elif grades[i] == 'B0':
            grade = 7
        elif grades[i] == 'C+':
            grade = 6
        elif grades[i] == 'C0':
            grade = 5
        elif grades[i] == 'D+':
            grade = 4
        elif grades[i] == 'D0':
            grade = 3
        elif grades[i] == 'F':
            grade = 0
        result += weights[i] * grade
    return result - threshold

print(solution(["B+","A0","C+"], [6,7,8], 200))