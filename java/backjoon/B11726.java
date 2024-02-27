import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11726 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int[] Dy;

    static void preprocess(int n) {

        Dy = new int[1005];
        Dy[1] = 1;
        Dy[2] = 2;

        for(int i = 3; i <= n; i++) {
            Dy[i] = (Dy[i-1] + Dy[i-2]) % 10007;
        }

        System.out.println(Dy[n]);
    }

    public static void main(String[] args) {
        int i = scan.nextInt();
        preprocess(i);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

