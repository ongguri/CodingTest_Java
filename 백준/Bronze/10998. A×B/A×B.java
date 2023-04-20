import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mul = 1;

        while(st.countTokens() != 0) {
            mul *= Integer.parseInt(st.nextToken());
        }
        
        System.out.println(mul);
    }
}