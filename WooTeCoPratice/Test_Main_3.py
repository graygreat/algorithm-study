def solution(money, expected, actual):
    bat_money = 100
    have_money = money - bat_money
    for i in range(len(expected)):
        if expected[i] == actual[i]:
            have_money += bat_money * 2
            bat_money = 100
            have_money = have_money - bat_money
        else:
            bat_money *= 2
            if bat_money > have_money:
                bat_money = have_money
            have_money -= bat_money

    return have_money + bat_money


print(solution(1000, ['H', 'T', 'H', 'T', 'H', 'T', 'H'], ['T', 'T', 'H', 'H', 'T', 'T', 'H']))
print(solution(1200, 	['T', 'T', 'H', 'H', 'H'], ['H', 'H', 'T', 'H', 'T']))