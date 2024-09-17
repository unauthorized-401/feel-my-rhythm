package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // 과목 수
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int[] scores = new int[n];
        int max = 0;
        int sum = 0;
        double result = 0;

        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(token.nextToken());
            scores[i] = score;

            if (max < score) max = score;
            sum += score;
        }

        for (int j = 0; j < n; j++) {
            result += (double) scores[j] / max * 100;
        }

        writer.write((result / n) + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
