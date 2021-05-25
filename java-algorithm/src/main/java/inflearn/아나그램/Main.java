package inflearn.아나그램;

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
    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data1 = br.readLine();
        String data2 = br.readLine();
        Map<Character, Integer> map = new HashMap<>();



        for (char data : data1.toCharArray()) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }
        for (char data : data2.toCharArray()) {
            if (!map.containsKey(data) || map.get(data) == 0) {
                return "NO";
            }
            map.put(data, map.get(data) - 1);
        }
        return "YES";
    }
}
