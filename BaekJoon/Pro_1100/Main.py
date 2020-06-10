chessList = []
count = 0

for _ in range(8):
    chessList.append(list(map(str, list(input()))))

for i in range(8):
    for j in range(8):
        if((i % 2 == 0) and (j % 2 == 0)):
            if(chessList[i][j] == 'F'):
                count += 1
        elif((i % 2 == 1) and (j % 2 == 1)):
            if(chessList[i][j] == 'F'):
                count += 1
print(count)