package etc.kakaopay_2021_intership.test4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {

    private static ArrayList<Node> graph = new ArrayList<>();

    public static void main(String[] args) {
        long[] ages = {35, 25, 3, 8, 7};
        int[][] wires = {{1, 2, 5}, {2, 1, 5}, {1, 3, 2}, {3, 4, 2}, {3, 5, 2}, {4, 5, 1}};

        Solution solution = new Solution();
        solution.solution(ages, wires);
    }
    public int[] solution(long[] ages, int[][] wires) {

        for (int[] wire : wires) {
            for (int i = 0; i < wire.length; i++) {

            }
        }

        return new int[0];
    }

    static class Node {
        private int start;
        private int end;
        private int length;

        public Node(int start, int end, int length) {
            this.start = start;
            this.end = end;
            this.length = length;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public int getLength() {
            return length;
        }
    }
}
