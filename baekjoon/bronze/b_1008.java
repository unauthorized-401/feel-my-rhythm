package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1008 {
    public static void main(String[] args) throws IOException {
        // 1 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        double n1 = Double.parseDouble(tokenizer.nextToken());
        double n2 = Double.parseDouble(tokenizer.nextToken());

        System.out.println(n1 / n2);
    }
}
