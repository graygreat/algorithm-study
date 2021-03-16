# https://programmers.co.kr/learn/courses/30/lessons/12930

def solution(s):
    words_list = s.split() 
    new_list = []
    for word in words_list: 
        new_words = ""
        for i in range(len(word)):
            new_words += word[i].upper() if i%2 == 0 else word[i].lower() 
        new_list.append(new_words)
    return " ".join(new_list)
    
print(solution("try hello world"))