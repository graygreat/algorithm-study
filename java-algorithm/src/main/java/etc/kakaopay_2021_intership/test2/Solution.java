package etc.kakaopay_2021_intership.test2;

public class Solution {
    public int[] solution(int rows, int columns, int[][] swipes) {
        int[] answer = new int[swipes.length];
        int[][] base = new int[rows + 1][columns + 1];

        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < columns + 1; j++) {
                base[i][j] = ((i - 1) * columns + j);
            }
        }

        for (int i = 0; i < swipes.length; i++) {
            int tmp_rows = swipes[i][3] - swipes[i][1] + 1;
            int tmp_columns = swipes[i][4] - swipes[i][2] + 1;
            int[][] tmp = new int[tmp_rows][tmp_columns];

            for (int j = 0; j < tmp_rows; j++) {
                for (int k = 0; k < tmp_columns; k++) {
                    tmp[j][k] = base[swipes[i][1] + j][swipes[i][2] + k];
                }
            }

            int[] sum = {};

            switch (swipes[i][0]) {
                case 1:
                    sum = new int[tmp_columns];

                    for (int j = 0; j < tmp_columns; j++) {
                        sum[j] = tmp[tmp_rows - 1][j];
                    }

                    for (int j = tmp_rows - 1; j > 0; j--) {
                        for (int k = 0; k < tmp_columns; k++) {
                            tmp[j][k] = tmp[j - 1][k];
                        }
                    }

                    for (int j = 0; j < tmp_columns; j++) {
                        tmp[0][j] = sum[j];
                    }

                    break;
                case 2:
                    sum = new int[tmp_columns];

                    for (int j = 0; j < tmp_columns; j++) {
                        sum[j] = tmp[0][j];
                    }

                    for (int j = 0; j < tmp_rows - 1; j++) {
                        for (int k = 0; k < tmp_columns; k++) {
                            tmp[j][k] = tmp[j + 1][k];
                        }
                    }

                    for (int j = 0; j < tmp_columns; j++) {
                        tmp[tmp_rows - 1][j] = sum[j];
                    }

                    break;
                case 3:
                    sum = new int[tmp_rows];

                    for (int j = 0; j < tmp_rows; j++) {
                        sum[j] = tmp[j][tmp_columns - 1];
                    }

                    for (int j = tmp_columns - 1; j > 0; j--) {
                        for (int k = 0; k < tmp_rows; k++) {
                            tmp[k][j] = tmp[k][j - 1];
                        }
                    }

                    for (int j = 0; j < tmp_rows; j++) {
                        tmp[j][0] = sum[j];
                    }

                    break;

                case 4:
                    sum = new int[tmp_rows];

                    for (int j = 0; j < tmp_rows; j++) {
                        sum[j] = tmp[j][0];
                    }

                    for (int j = 0; j < tmp_columns - 1; j++) {
                        for (int k = 0; k < tmp_rows; k++) {
                            tmp[k][j] = tmp[k][j + 1];
                        }
                    }

                    for (int j = 0; j < tmp_rows; j++) {
                        tmp[j][tmp_columns - 1] = sum[j];
                    }

                    break;

                default:
            }

            for (int j = 0; j < tmp_rows; j++) {
                for (int k = 0; k < tmp_columns; k++) {
                    base[swipes[i][1] + j][swipes[i][2] + k] = tmp[j][k];
                }
            }

            for (int j = 0; j < sum.length; j++) {
                answer[i] += sum[j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] swipes = {{1, 1, 2, 4, 3}, {3, 2, 1, 2, 3}, {4, 1, 1, 4, 3}, {2, 2, 1, 3, 3}};
        Solution solution = new Solution();
        int[] solution1 = solution.solution(4, 3, swipes);
        for (int i : solution1) {
            System.out.println(i);
        }
    }
}
