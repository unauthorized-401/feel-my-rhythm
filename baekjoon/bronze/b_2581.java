package baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class b_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        List<Integer> primes = new ArrayList<>(List.of(2));

        int sum = 0;
        int min_index = -1;

        // n 이하의 소수
        for (int i = 3; i <= n; i+=2) {
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

        for (int i = 0; i < primes.size(); i++) {
            int target = primes.get(i);
            if (target >= m) {
                sum += target;
                if (min_index == -1) {
                    min_index = i;
                }
            }
        }

        // 예외처리
        if (m == 1 && n == 1) {
            writer.write(-1 + "\n");
        } else if (sum != 0) {
            writer.write(sum + "\n" + primes.get(min_index) + "\n");
        } else {
            writer.write(-1 + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
