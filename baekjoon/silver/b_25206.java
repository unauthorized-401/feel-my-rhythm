package baekjoon.silver;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class b_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;

        // 과목평점 표
        String[] levels = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        double sum = 0.0; // 전공과목별 (학점 × 과목평점)의 합
        double total = 0.0; // 학점의 총합

        for (int i = 0; i < 20; i++) {
            token = new StringTokenizer(reader.readLine(), " ");

            // 과목명, 학점, 등급
            String name = token.nextToken();
            double score = Double.parseDouble(token.nextToken());
            String level = token.nextToken();

            if (Objects.equals(level, "P")) {
                continue;
            }

            // 과목평점 찾기
            double average = 0.0;
            for (int j = 0; j < levels.length; j++) {
                if (levels[j].equals(level)) {
                    average = scores[j];
                    break;
                }
            }

            sum += score * average;
            total += score;
        }

        writer.write((sum / total) + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
