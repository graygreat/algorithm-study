mother_word = input()
frog_word = []

for word in mother_word:
    if ord(word) > 97 and ord(word) < 122:
        frog_word.append(chr(219 - ord(word)))
    elif ord(word) > 65 and ord(word) < 90:
        frog_word.append(chr(155 - ord(word)))
    else:
        frog_word.append(word)

print(''.join(frog_word))

