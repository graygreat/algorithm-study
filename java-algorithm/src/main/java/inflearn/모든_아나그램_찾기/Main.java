package inflearn.모든_아나그램_찾기;

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

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sData = br.readLine();
        String tData = br.readLine();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int answer = 0;

        int length = tData.length();
        int lt = 0;

        for (char t : tData.toCharArray()) {
            tMap.put(t, tMap.getOrDefault(t, 0) + 1);
        }

        for (int rt = 0; rt < length - 1; rt++) {
            sMap.put(sData.charAt(rt), sMap.getOrDefault(sData.charAt(rt), 0) + 1);
        }

        for (int rt = length - 1; rt < sData.length(); rt++) {
            sMap.put(sData.charAt(rt), sMap.getOrDefault(sData.charAt(rt), 0) + 1);

            if (sMap.equals(tMap)) {
                answer += 1;
            }
            sMap.put(sData.charAt(lt), sMap.get(sData.charAt(lt)) - 1);

            if (sMap.get(sData.charAt(lt)) == 0) {
                sMap.remove(sData.charAt(lt));
            }
            lt += 1;
        }

        return answer;
    }
}
