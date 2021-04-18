package etc.godOfJava.chapter8;

public class ManageStudent {
    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sok", "Seoul", "01088888888", "asdf@gmail.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student st : students) {
            System.out.println(st.toString());
        }
    }

    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] student = null;
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }
}
