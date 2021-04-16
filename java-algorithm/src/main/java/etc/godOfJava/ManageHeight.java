package etc.godOfJava;

import java.util.Arrays;

public class ManageHeight {

    private int[][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 0; i < 5; i++) {
//            manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }
    }

    public void setData() {
        gradeHeights = new int[5][];

        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
//        Arrays.sort(classHeights);
        System.out.println("Class No.:" + (classNo + 1));
        for (int data : gradeHeights[classNo - 1]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double summary = 0;
        int studentCount = gradeHeights[classNo].length;
        for (int data : gradeHeights[classNo]) {
            summary += data;
        }
        System.out.println("Class No.:" + (classNo + 1));
        System.out.println("Height average:" + (summary / studentCount));
    }
}
