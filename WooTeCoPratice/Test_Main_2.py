def solution(s, op):
    result = []
    for i in range(1, len(s)):
        if op == '+':
            result.append(int(s[:i]) + int(s[i:]))
        elif op == '-':
            result.append(int(s[:i]) - int(s[i:]))
        if op == '*':
            result.append(int(s[:i]) * int(s[i:]))
    return result

print(solution("31402", "*"))
