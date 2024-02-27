import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15651 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] selected;

    static void input() {
        Scan scan = new Scan();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M+1];
    }

    static void rec_func(int k) {
        if (k == M+1) {
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            } sb.append('\n');
        } else {
            for (int candidate = 1; candidate <= N; candidate++) {
                selected[k] = candidate;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);

        System.out.println(sb.toString());
    }

    static class Scan {
        BufferedReader br;
        StringTokenizer st;

        public Scan() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
