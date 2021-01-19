import sys
from collections import deque

data_set = list(map(str, sys.stdin.readline().rstrip()))
data_set_queue = deque(data_set)
alphabet = []
number_sum = 0

while data_set_queue:
    start = data_set_queue.popleft()
    if ord(start) >= 65:
        alphabet.append(start)
    else:
        number_sum += int(start)

alphabet.sort()
print(''.join(alphabet) + str(number_sum))