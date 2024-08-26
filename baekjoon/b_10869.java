package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10869 {
    public static void main(String[] args) throws IOException {
        // 7 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n1 = Integer.parseInt(tokenizer.nextToken());
        int n2 = Integer.parseInt(tokenizer.nextToken());

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
    }
}
