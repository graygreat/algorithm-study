package inflearn.Recursive_Tree_Graph.팩토리얼;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    public void solution() {
        System.out.println(dfs(5));
    }

    public int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        return n * dfs(n - 1);
    }
}
