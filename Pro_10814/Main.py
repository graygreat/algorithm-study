N = int(input())

memberList = []

for _ in range(N):
    age, name = map(str, input().split())
    memberList.append((int(age), name))

memberList.sort(key = lambda age : age[0])

for member in memberList:
    print(member[0], member[1])