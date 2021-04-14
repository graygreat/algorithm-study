package 이것이코딩테스트다.implementation.문자열_재정렬;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    /**
    public String solution() {
        String data = scanner.next();
        int summary = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            int convertedData = (int) data.charAt(i);
            if (convertedData >= 65 && convertedData <= 90) {
                stringBuilder.append(data.charAt(i));
            } else {
                summary += convertedData - 48;
            }
        }
        String[] stringData = stringBuilder.toString().split("");
        Arrays.sort(stringData);
        return String.join("", stringData) + Integer.toString(summary);
    }
     **/

    public void solution() {
        String dataSet = scanner.next();
        int summary = 0;
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < dataSet.length(); i++) {
            if (Character.isLetter(dataSet.charAt(i))) {
                result.add(dataSet.charAt(i));
            }
            else {
                summary += dataSet.charAt(i) - '0';
            }
        }

        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

        if (summary != 0) {
            System.out.print(summary);
        }
        System.out.println();
    }
}

// K1KA5CB7
// AJKDLSI412K4JSJ9D