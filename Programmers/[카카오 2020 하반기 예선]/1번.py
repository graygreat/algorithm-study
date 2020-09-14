import re

def solution(new_id):
    new_id = new_id.lower()
    new_id = re.sub('\.{2,}', '.', new_id)
    new_id = re.findall('[a-z0-9-._]', new_id)
    new_id = ''.join(new_id)
    new_id = re.sub('\.{2,}', '.', new_id)
    new_id = re.sub('(^\.|\.$)', '', new_id)
    if len(new_id) == 0:
        new_id += 'a'
    if len(new_id) <= 2:
        while(len(new_id) <= 2):
            new_id += new_id[-1]
    if len(new_id) >= 16:
        new_id = new_id[:15]
        if str(new_id[14]) == '.':
            new_id = new_id[:14]

    return new_id

print(solution("=.="))

# print(solution("...!@BaT#*..y.abcdefghijklm"))
# print(solution(".1"))