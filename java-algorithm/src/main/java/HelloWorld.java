import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        return 0;

    }
}
