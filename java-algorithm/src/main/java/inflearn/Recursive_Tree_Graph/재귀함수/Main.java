package inflearn.Recursive_Tree_Graph.재귀함수;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        dfs(3);
    }

    public void dfs(int n) {
        if (n == 0) {
            return;
        }
        dfs(n - 1);
        System.out.print(n + " ");
    }
}
