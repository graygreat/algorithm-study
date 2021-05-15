package etc.godOfJava.chapter33.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 33, 89, 100));
        studentList.add(new StudentDTO("건빵", 47, 79, 20));

        List<String> nameList = studentList.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
//        sample.printStudentNames(studentList);
//        sample.printStudentInformation(studentList);
        sample.filterWithScoreForLoop(studentList, 80);
    }

    public void printStudentNames(List<StudentDTO> students) {
        students.stream().forEach(student -> System.out.println(student.getName()));
    }

    public void printStudentInformation(List<StudentDTO> students) {
        students.stream().forEach(student -> System.out.printf("이름: %s, 수학 점수: %s, 영어 점수: %s\n", student.getName(), student.getScoreMath(), student.getScoreEnglish()));
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
        studentList.stream()
                .filter(student -> student.getScoreMath() > scoreCutLine)
                .forEach(student -> System.out.println(student.getName()));
    }


}
