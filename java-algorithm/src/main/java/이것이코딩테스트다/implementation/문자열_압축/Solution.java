package 이것이코딩테스트다.implementation.문자열_압축;

class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int position = 0;
            int length = s.length();

            for (; position + i <= s.length(); ) {
                String unit = s.substring(position, position + i);
                position += i;

                int count = 0;
                for (; position + i <= s.length(); ) {
                    if (unit.equals(s.substring(position, position + i))) {
                        count += 1;
                        position += i;
                    } else {
                        break;
                    }
                }

                if (count > 0) {
                    length -= i * count;

                    if (count < 9) {
                        length += 1;
                    } else if (count < 99) {
                        length += 2;
                    } else if (count < 999) {
                        length += 3;
                    } else {
                        length += 4;
                    }
                }
                answer = Math.min(answer, length);
            }
        }
        return answer;
    }
}