# 구현

data_set = input()
sum_digit_data = 0
alpha_data = ''

for data in data_set:
    if data.isalpha():
        alpha_data += data
    else:
        sum_digit_data += int(data)

if sum_digit_data > 0:
    print(''.join(sorted(alpha_data))+ str(sum_digit_data))
else:
    print(''.join(sorted(alpha_data)))