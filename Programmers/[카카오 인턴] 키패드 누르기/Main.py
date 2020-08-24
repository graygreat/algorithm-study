# 출처 : https://programmers.co.kr/learn/courses/30/lessons/67256
# 2020년 카카오 인턴십
def solution(numbers, hand):
    answer = ''
    leftKey = [1, 4, 7]
    rightKey = [3, 6, 9]
    leftLocation = '*'
    rightLocation = '#'
    position = {1: (0, 0), 2: (0, 1), 3: (0, 2),
                4: (1, 0), 5: (1, 1), 6: (1, 2),
                7: (2, 0), 8: (2, 1), 9: (2, 2),
                '*': (3, 0), 0: (3, 1), '#': (3, 2)}
    for num in numbers:
        if num in leftKey:
            answer += 'L'
            leftLocation = num
        elif num in rightKey:
            answer += 'R'
            rightLocation = num
        else:
            leftDistance = abs(position[leftLocation][0] - position[num][0]) + abs(position[leftLocation][1] - position[num][1])
            rightDistance = abs(position[rightLocation][0] - position[num][0]) + abs(position[rightLocation][1] - position[num][1])
            if leftDistance < rightDistance:
                answer += 'L'
                leftLocation = num
            elif leftDistance > rightDistance:
                answer += 'R'
                rightLocation = num
            else:
                if hand == 'right':
                    answer += 'R'
                    rightLocation = num
                elif hand == 'left':
                    answer += 'L'
                    leftLocation = num

    return answer
print(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right"))





