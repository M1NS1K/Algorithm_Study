import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int layer = 0;
        int lastNumber = 1;

        if(N == 1) layer = 1;

        while(lastNumber < N) {
            lastNumber = lastNumber + 6 * layer; // sum + 6n
            layer++;
        }

        int answer = layer;
        System.out.println(answer);
    }
}
