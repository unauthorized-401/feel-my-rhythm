package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_11382 {
    public static void main(String[] args) throws IOException {
        // 77 77 7777
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        long a = Long.parseLong(tokenizer.nextToken());
        long b = Long.parseLong(tokenizer.nextToken());
        long c = Long.parseLong(tokenizer.nextToken());

        System.out.println(a+b+c);
    }
}