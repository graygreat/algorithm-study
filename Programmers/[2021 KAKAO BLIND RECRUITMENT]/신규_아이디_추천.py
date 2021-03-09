# https://programmers.co.kr/learn/courses/30/lessons/72410

def solution(new_id):
    # 1단계
    new_id = new_id.lower()

    # 2단계
    answer = ''
    for word in new_id:
        if word.isalnum() or word in '-_.':
            answer += word

    # 3단계
    while '..' in answer:
        answer = answer.replace('..', '.')

    # 4단계
    if answer[0] == '.':
        answer = answer[1:]
    
    if len(answer) >= 1 and answer[-1] == '.':
        answer = answer[:-1]

    # 5단계
    if answer == '':
        answer = 'a'
    
    # 6단계
    if len(new_id) >= 16:
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer[:-1]
    # 7단계
    if len(answer) <= 2:
        answer = answer + answer[-1] * (3 - len(answer))
        print(answer)
    return answer

# print(solution(	"...!@BaT#*..y.abcdefghijklm"))
# print(solution("z-+.^."))
print(solution("=.="))
# print(solution("123_.def"))
# print(solution("abcdefghijklmn.p"))