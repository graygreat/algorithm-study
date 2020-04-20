N = int(input())

seq = []

while N:
    if(N & 1):
        seq.append("[/]")
        N *= 2
    elif(N & 2):
        seq.append("[+]")
        N -= 2
    else:
        seq.append("[*]")
        N //= 2

print(len(seq))
print(' '.join(seq[::-1]))