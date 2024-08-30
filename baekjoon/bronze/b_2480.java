package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2480 {
    public static void main(String[] args) throws IOException {
        // 3 3 6
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());

        int score = 0;

        if ((a == b) && (b == c)) {
            score = a * 1000 + 10000;
        } else if ((a == b) || (b == c) || (a == c)) {
            if (a == b) {
                score = a * 100 + 1000;
            } else {
                score = c * 100 + 1000;
            }
        } else {
            score = Math.max(Math.max(a, b), c) * 100;
        }

        System.out.println(score);
    }
}
