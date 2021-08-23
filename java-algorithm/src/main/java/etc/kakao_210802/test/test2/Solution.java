package etc.kakao_210802.test.test2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Collections;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int solution(int n) {
        int[] factorialArray = factorial();
        List<Integer> list = new ArrayList<>();
        list.add(n);
        int nextAttack = nextAttacker(n, factorialArray);

        while (!list.contains(nextAttack)) {
            list.add(nextAttack);
            nextAttack = nextAttacker(nextAttack, factorialArray);
        }

        Collections.sort(list);

        return list.get(list.size() - 1) * list.size();
    }

    public static int[] factorial() {
        int[] array = new int[10];
        Arrays.fill(array, 1);

        for (int i = 1; i < 10; i++) {
            array[i] *= i * array[i - 1];
        }

        return array;
    }

    public static int nextAttacker(int n, int[] factorial) {
        char[] number = Integer.toString(n).toCharArray();
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum += factorial[number[i] - '0'];
        }

        return sum;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.solution(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}