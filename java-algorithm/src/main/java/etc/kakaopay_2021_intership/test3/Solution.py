def solution(line1, line2):

    answer = 0

    length_line1 = len(line1)
    length_line2 = len(line2)

    idx = 0
    while (idx < length_line1 - length_line2 + 1):

        if (line1[idx] == line2[0]):
            space = 0
            while (True):
                length_spaced = length_line2 + (length_line2 - 1) * space
                if (length_spaced > length_line1 - idx):
                    break

                for i in range(length_line2):
                    if (line1[idx + i*space + i] != line2[i]):
                        break
                else:
                    answer += 1

                space += 1


        idx += 1

    return answer