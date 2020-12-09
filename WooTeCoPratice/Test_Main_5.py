def solution(penter, pexit, pescape, data):
    result_data = []
    start = 0
    for i in range(1, (len(data) // len(penter)) + 1):
        insert_data = data[start:i * len(penter)]
        if insert_data == penter or insert_data == pescape or insert_data == pexit:
            result_data.append(pescape)
        result_data.append(insert_data)
        start = i * len(penter)

    return penter + ''.join(result_data) + pexit


# print(solution("1100", "0010", "1001", "1101100100101111001111000000"))

print(solution("10", "11", "00", "00011011"))