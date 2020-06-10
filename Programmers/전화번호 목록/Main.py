def solution(phone_book):
    answer = True
    length = len(phone_book)
    for i in range(length):
        for j in range(length):
            if(phone_book[i].find(phone_book[j]) == 0 and i != j):
                answer = False
                return answer

    return answer

## 좋아요 많이 받은 풀이
# def solution(phoneBook):
#     phoneBook = sorted(phoneBook)
#
#     for p1, p2 in zip(phoneBook, phoneBook[1:]):
#         if p2.startswith(p1):
#             return False
#     return True
