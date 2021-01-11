def solution(n, lost, reserve):
    setLost = set(lost) - set(reserve)
    setReserve = set(reserve) - set(lost)

    print(setLost, setReserve)
    for num in setReserve:
        a = num - 1
        b = num + 1
        if a in setLost:
            setLost.remove(a)
        elif b in setLost:
            setLost.remove(b)

    return n - len(setLost)

print(solution(5, [2, 4], [1, 3, 5]))
print(solution(5, [1, 2], [2, 3]))
