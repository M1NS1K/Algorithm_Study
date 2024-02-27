public class Programmers_네트워크 {
    static int n = 3;
    static int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
    static int num;

    static void dfs(int n, int computers[][], boolean[] visited, int idx) {
        visited[idx] = true;

        for(int i=0;i<n;i++) {
            if(computers[idx][i]==1 && !visited[i] && i!=idx) {
                System.out.println(visited[i]);
                dfs(n, computers, visited, i);
            }
        }
    }

    static int solution(int n, int computers[][]) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        num = 0;

        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                dfs(n, computers, visited, i);
                num++;
            }
        }

        answer = num;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(n, computers));
    }
}
