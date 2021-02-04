# https://programmers.co.kr/skill_checks/242735?challenge_id=2565

def solution(n, lost, reserve):
    setLost = set(lost) - set(reserve)
    setReserve = set(reserve) - set(lost)

    for num in setReserve:
        a = num - 1
        b = num + 1
        if a in setLost:
            setLost.remove(a)
        elif b in setLost:
            setLost.remove(b)

    return n - len(setLost)

solution(5, [2, 4], [1, 3, 5])