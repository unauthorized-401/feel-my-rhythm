package baekjoon.bronze;

import java.io.*;

public class b_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] results = new int[43];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            results[num % 42] += 1;
        }

        // 값이 1 이상인 배열 방의 개수
        for (int j = 0; j < 43; j++) {
            if (results[j] > 0)
                count += 1;
        }
        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
