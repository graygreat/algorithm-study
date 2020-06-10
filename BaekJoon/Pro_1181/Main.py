N = int(input())

S = [input() for i in range(N)]
S = set(S)                      # 중복 값 제거
SA = sorted(S, key=str.lower)   # string 정렬
SL = sorted(SA, key=len)        # length 정렬

for i in range(len(SL)):
    print(SL[i])
