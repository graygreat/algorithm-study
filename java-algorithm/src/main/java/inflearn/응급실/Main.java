package inflearn.응급실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private int id;
    private int risk;

    public Patient(int id, int risk) {
        this.id = id;
        this.risk = risk;
    }

    public int getId() {
        return id;
    }

    public int getRisk() {
        return risk;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        System.out.println(main.solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = countData[0];
        int m = countData[1];
        int[] inputData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Queue<Patient> queue = new LinkedList<>();
        int answer = 1;

        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(i, inputData[i]));
        }

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            for (Patient person : queue) {
                if (patient.getRisk() < person.getRisk()) {
                    queue.offer(patient);
                    patient = null;
                    break;
                }
            }
            if (patient != null){
                if (patient.getId() == m) {
                    return answer;
                } else {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
