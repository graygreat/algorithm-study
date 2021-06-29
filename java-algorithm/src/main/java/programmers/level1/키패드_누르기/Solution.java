package programmers.level1.키패드_누르기;

import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers, hand));
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftLocation = 10;
        int rightLocation = 12;

        HashMap<Integer, Location> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put(i + 1, new Location(i / 3, i % 3));
        }

        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftLocation = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightLocation = number;
            } else {
                Location center = map.get(number);
                Location left = map.get(leftLocation);
                Location right = map.get(rightLocation);

                if (getDistance(left.getX(), left.getY(), center.getX(), center.getY())
                        < getDistance(right.getX(), right.getY(), center.getX(), center.getY())) {
                    answer.append("L");
                    leftLocation = number;
                } else if (getDistance(left.getX(), left.getY(), center.getX(), center.getY())
                        > getDistance(right.getX(), right.getY(), center.getX(), center.getY())){
                    answer.append("R");
                    rightLocation = number;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftLocation = number;
                    } else {
                        answer.append("R");
                        rightLocation = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    double getDistance(int x, int y, int x1, int y1) {
        return Math.abs(x - x1) + Math.abs(y - y1);
    }

    static class Location {
        private int x;
        private int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
