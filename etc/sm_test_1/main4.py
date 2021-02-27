def main():
    n = int(input())
    data_set = list(map(int, input().split()))
    max_value = 0
    
    for i in range(3):
        currentIndex = i
        visited = [False for _ in range(n)]
        count = 1

        while True:
            if not visited[currentIndex]:
                visited[currentIndex] = True
                currentIndex = currentIndex + data_set[currentIndex]
                count += 1
            else:
                max_value = max(max_value, count)
                break
    
    print(max_value)
    
if __name__=="__main__":
    main()