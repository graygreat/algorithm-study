N = int(input())
count = 0

for _ in range(N):
    strWord = input()
    if(list(strWord) == sorted(strWord, key=strWord.find)):
        count += 1

print(count)

