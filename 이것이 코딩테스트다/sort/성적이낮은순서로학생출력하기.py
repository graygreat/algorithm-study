n = int(input())

grade_dict = {}
for _ in range(n):
    name, grade = input().split()
    grade_dict[name] = int(grade)

grade_dict = sorted(grade_dict, key=lambda x : x[1], reverse=True)

for name in grade_dict:
    print(name, end=' ')