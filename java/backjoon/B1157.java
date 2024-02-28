import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase();

        Map<Character, Integer> savedCh = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            if(savedCh.containsKey(input.charAt(i))) {
                Integer i1 = savedCh.get(input.charAt(i));
                savedCh.replace(input.charAt(i), i1 + 1);
            } else{
                savedCh.put(input.charAt(i), 1);
            }
        }

        int max = 0;
        char answer = 0;
        boolean duplicateCheck = false;
        for (Character c : savedCh.keySet()) {
            if(savedCh.get(c) == max) duplicateCheck = true;
            if(savedCh.get(c) > max) {
                max = savedCh.get(c);
                duplicateCheck = false;
                answer = c;
            }
        }

        if(duplicateCheck) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}
