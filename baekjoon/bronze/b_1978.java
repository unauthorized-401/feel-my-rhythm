package baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
        int count = 0;

        // 1000 이하 소수
        List<Integer> primes = new ArrayList<>(List.of(2, 3, 5, 7));
        for (int i = 7; i < 1000; i+=2) {
            boolean flag = false;
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                primes.add(i);
            }
        }

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(token.nextToken());

            if (primes.contains(target)) {
                count += 1;
            }
        }

        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
