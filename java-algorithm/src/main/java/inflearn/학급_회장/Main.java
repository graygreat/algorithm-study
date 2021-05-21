package inflearn.학급_회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());

    }

    public char solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String inputData = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        char answer = ' ';

        for (char data : inputData.toCharArray()) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        int max = 0;
        for (char data : map.keySet()) {
            if (max < map.get(data)) {
                max = map.get(data);
                answer = data;
            }
        }
        return answer;
    }
}
