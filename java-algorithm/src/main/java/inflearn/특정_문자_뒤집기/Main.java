package inflearn.특정_문자_뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public String solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        char[] array = inputData.toCharArray();
        int firstIndex = 0;
        int lastIndex = inputData.length() - 1;

        while (firstIndex < lastIndex) {
            if (!Character.isAlphabetic(array[firstIndex])) {
                firstIndex += 1;
            } else if (!Character.isAlphabetic(array[lastIndex])) {
                lastIndex -= 1;
            } else {
                char temp = array[firstIndex];
                array[firstIndex] = array[lastIndex];
                array[lastIndex] = temp;
                firstIndex += 1;
                lastIndex -= 1;
            }

        }
        return String.valueOf(array);
    }
}
