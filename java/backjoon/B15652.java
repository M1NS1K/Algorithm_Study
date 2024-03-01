import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15652 {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M + 1];
    }

    public static void solution(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int candidate = 1; candidate <= N; candidate++) {
                boolean isUsed = false;
                for (int i = 1; i < k; i++) {
                    if (selected[i] > candidate) {
                        isUsed = true;
                    }
                }

                if (!isUsed) {
                    selected[k] = candidate;
                    solution(k + 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution(1);
        System.out.println(sb.toString());
    }
}
