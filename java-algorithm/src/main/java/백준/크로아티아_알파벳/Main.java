package 백준.크로아티아_알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        int index = 0;
        int length = alphabet.length();
        int answer = 0;

        for (; index < length; ) {
            if (alphabet.charAt(index) == 'c') {
                if (index < length - 1 && alphabet.charAt(index + 1) == '=') {
                    index += 2;
                } else if (index < length - 1 && alphabet.charAt(index + 1) == '-'){
                    index += 2;
                } else {
                    index += 1;
                }
            } else if (alphabet.charAt(index) == 'd') {
                if (index < length - 1 && alphabet.charAt(index + 1) == '-') {
                    index += 2;
                } else if (index < length - 2 && (alphabet.charAt(index + 1) == 'z' && alphabet.charAt(index + 2) == '=')) {
                    index += 3;
                } else {
                    index += 1;
                }
            } else if (alphabet.charAt(index) == 'l') {
                if (index < length - 1 && alphabet.charAt(index + 1) == 'j') {
                    index += 2;
                } else {
                    index += 1;
                }
            } else if (alphabet.charAt(index) == 'n') {
                if (index < length - 1 && alphabet.charAt(index + 1) == 'j') {
                    index += 2;
                } else {
                    index += 1;
                }
            } else if (alphabet.charAt(index) == 's') {
                if (index < length - 1 && alphabet.charAt(index + 1) == '=') {
                    index += 2;
                } else {
                    index += 1;
                }
            } else if (alphabet.charAt(index) == 'z') {
                if (index < length - 1 && alphabet.charAt(index + 1) == '=') {
                    index += 2;
                } else {
                    index += 1;
                }
            } else {
                index += 1;
            }
            answer += 1;
        }
        System.out.println(answer);
    }
}
