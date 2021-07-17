package 이것이코딩테스트다.sorting.성적이_낮은_순서로_학생_출력하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return -1;
        }
        return 1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            list.add(new Student(name, score));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i).getName() + " ");
        }
    }

}
