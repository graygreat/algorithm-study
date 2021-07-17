package 이것이코딩테스트다.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int n = 10;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
