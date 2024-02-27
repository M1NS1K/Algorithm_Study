import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2839 {
    static int answer;

    public static void bfs(int n, int cnt) {
        if(n < 0) {
            return;
        }

        if(n == 0) {
            if(answer > cnt) {
                answer = cnt;
            }
        }

        bfs(n-3, cnt+1);
        bfs(n-5, cnt+1);
    }

    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int value = Integer.parseInt(st.nextToken());
        answer = value;

        bfs(value, 0);

        if(answer == value) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
