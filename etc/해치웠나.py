def main():
    x = list(input())
    count = 0
    for i in x:
        if i == '(':
            count += 1
        else:
            count -= 1
    if count == 0:
        print('YES')
    else:
        print('NO')

if __name__=="__main__":
    main()