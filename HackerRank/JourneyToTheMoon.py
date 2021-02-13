#https://www.hackerrank.com/challenges/journey-to-the-moon/problem

def find_set_index(a):
    for i in range(len(a_set_list)):
        if a in a_set_list[i]:
            return i

def journeyToMoon(n, astronaut):
    for a1, a2 in astronaut:
        i1, i2 = find_set_index(a1), find_set_index(a2)
        if i1 != i2:
            a_set_list[i1] = a_set_list[i1].union(a_set_list[i2])
            del a_set_list[i2]
        print(a_set_list)
    sum, res = 0, 0
    for s in a_set_list:
        res += sum * len(s)
        sum += len(s)
        print(res, sum)
    return res

n, p = map(int, input().split())

astronauts = []
for _ in range(p):
    astronauts.append(list(map(int, input().split())))

a_set_list = [{x} for x in range(n)]
result = journeyToMoon(n, astronauts)
print(result)