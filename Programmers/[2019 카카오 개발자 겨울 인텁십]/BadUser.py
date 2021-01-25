from itertools import permutations

def check(user_id, banned_id):
    for i in range(len(banned_id)):
        if len(user_id[i]) != len(banned_id[i]):
            return False
        for j in range(len(banned_id[i])):
            if banned_id[i][j] == '*':
                continue
            if user_id[i][j] != banned_id[i][j]:
                return False
    return True

def solution(user_id, banned_id):
    count = 0
    exclude_id = []
    for user in permutations(user_id, len(banned_id)):
        if check(user, banned_id) == True:
            user = set(user)
            if user not in exclude_id:
                exclude_id.append(user)
                count += 1
    return count

# print(solution(["frodo", "fradi", "crodo", "abc123", "frodoc"], ["fr*d*", "abc1**"]))
print(solution(["frodo", "fradi", "crodo", "abc123", "frodoc"], ["*rodo", "*rodo", "******"]))