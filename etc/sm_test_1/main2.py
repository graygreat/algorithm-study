def main():
    p, n, h = map(int, input().split())
    data_set = [[] for _ in range(p + 1)]

    for _ in range(n):
        x, y = map(int, input().split())
        data_set[x].append(y)

    for i in range(1, p + 1):
        data_set[i].sort()
        sum_data = 0

        for j in range(len(data_set[i])):
            if data_set[i][j] > h:
                print(i, sum_data)
                break
            else:
                sum_data += (data_set[i][j] * 1000)
                h -= data_set[i][j]
            
if __name__=="__main__":
    main()