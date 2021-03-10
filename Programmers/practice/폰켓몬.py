# https://programmers.co.kr/learn/courses/30/lessons/1845

def solution(nums):
    selected_mon_len = len(nums) // 2
    set_nums_len = len(set(nums))

    if set_nums_len >= selected_mon_len:
        return selected_mon_len
    else:
        return set_nums_len

print(solution([3,1,2,3]))
print(solution([3,3,3,2,2,4]))
print(solution([3,3,3,2,2,2]))