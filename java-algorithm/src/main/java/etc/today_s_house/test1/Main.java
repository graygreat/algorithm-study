package etc.today_s_house.test1;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        Map<Character, Integer> map = new LinkedHashMap<>();

        StringBuilder answer = new StringBuilder();

        char alpha = inputData.charAt(0);
        map.put(alpha, 0);

        StringBuilder num = new StringBuilder();
        int existNum = 0;

        for (int i = 1; i < inputData.length(); i++) {
            char data = inputData.charAt(i);

            if (Character.isDigit(data)) {
                num.append(data);
            } else {
                map.put(alpha, Integer.parseInt(String.valueOf(num)) + existNum);
                alpha = data;
                num = new StringBuilder();

                if (map.containsKey(data)) {
                    Integer integer = map.get(data);
                    existNum = integer;
                } else {
                    existNum = 0;
                }
            }
            if (i == inputData.length() - 1) {
                map.put(alpha, Integer.parseInt(String.valueOf(num)) + existNum);
                alpha = data;
                num = new StringBuilder();
            }
        }

        Set<Character> set = map.keySet();
        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            Character key = ((Character) iterator.next());
            Integer value = map.get(key);
            answer.append(key + value.toString());
        }
        return answer.toString();
    }
}
