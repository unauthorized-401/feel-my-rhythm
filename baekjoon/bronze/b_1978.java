package baekjoon.bronze;

import java.io.*;

public class b_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) break;

            int sum = 1;
            String sentence = n + " = 1";

            // 자신을 제외한
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sentence = sentence.concat(" + " + i);
                }
            }

            // 완전수
            if (sum == n) {
                writer.write(sentence + "\n");
            } else {
                writer.write(n + " is NOT perfect." + "\n");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
