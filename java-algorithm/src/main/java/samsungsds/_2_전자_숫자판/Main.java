package samsungsds._2_전자_숫자판;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        BufferedReader reader;
        String filename = "/Users/bennie/SourceCode/Algorithm/Algorithm/java-algorithm/src/main/java/samsungsds/_2_전자_숫자판/sample_input.txt";
        try {
            reader = new BufferedReader(new FileReader(filename));
            int t = Integer.parseInt(reader.readLine());

            for (int i = 0; i < t; i++) {
                String[] data = reader.readLine().split(" ");
                String left = String.format("%06d", Integer.parseInt(data[0]));
                String right = String.format("%06d", Integer.parseInt(data[1]));
                int symbolLength = Integer.parseInt(data[2]);

                String symbol = reader.readLine();

                int count = compare(left, right, symbolLength, symbol);
                System.out.println("#" + (i + 1) + " " + count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int compare(String left, String right, int symbolLength, String symbol) {
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();
        int result = 0;
        for (int i = 0; i < 6; i++) {
            if (leftArray[i] == rightArray[i]) {
                continue;
            }
            if (i + symbolLength > 6 && symbol.charAt(symbolLength - 1) != '0') {
                return -1;
            }
            int value = Math.abs(leftArray[i] - rightArray[i]);
            if (leftArray[i] < rightArray[i]) {
                if (symbol.charAt(0) != '+') {
                    StringBuilder stringBuilder = new StringBuilder(symbol);
                    symbol = stringBuilder.reverse().toString();
                }
                if (symbol.charAt(0) == '+') {
                    leftArray[i] += value;
                } else {
                    return -1;
                }
                if (leftArray[i] > '9') {
                    return -1;
                }
                for (int j = 1; j < symbolLength; j++) {
                    if (symbol.charAt(j) == '-') {
                        leftArray[i + j] -= value;
                    } else if (symbol.charAt(j) == '+') {
                        leftArray[i + j] += value;
                    }
                    if (leftArray[i] > '9' || leftArray[i] < '0') {
                        return -1;
                    }
                }
            } else if (leftArray[i] > rightArray[i]) {
                if (symbol.charAt(0) != '-') {
                    StringBuilder stringBuilder = new StringBuilder(symbol);
                    symbol = stringBuilder.reverse().toString();
                }
                if (symbol.charAt(0) == '-') {
                    leftArray[i] -= value;
                } else {
                    return -1;
                }
                if (leftArray[i] < '0') {
                    return -1;
                }
                for (int j = 1; j < symbolLength; j++) {
                    if (symbol.charAt(j) == '-') {
                        leftArray[i + j] -= value;
                    } else if (symbol.charAt(j) == '+') {
                        leftArray[i + j] += value;
                    }
                    if (leftArray[i] > '9' || leftArray[i] < '0') {
                        return -1;
                    }
                }
            }
            result += value;
        }

        if (String.valueOf(leftArray).equals(String.valueOf(rightArray))) {
            return result;
        }
        return -1;
    }
}
