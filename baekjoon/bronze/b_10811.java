package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        // 바구니 수, 바뀔 횟수
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int[] buckets = new int[n+1];

        for (int i = 0; i <= n; i++) {
            buckets[i] = i;
        }

        for (int j = 0; j < m; j++) {
            token = new StringTokenizer(reader.readLine(), " ");

            int left = Integer.parseInt(token.nextToken());
            int right = Integer.parseInt(token.nextToken());

            // 두 수가 같으면 스킵
            if (left == right) {
                continue;
            }

            // 왼쪽과 오른쪽으로 치환해가는 방식
            while (left < right) {
                int temp = buckets[left];
                buckets[left] = buckets[right];
                buckets[right] = temp;

                left += 1;
                right -= 1;
            }
        }

        for (int k = 1; k <= n; k++) {
            if (k == n) {
                writer.write(buckets[k] + "\n");
            } else {
                writer.write(buckets[k] + " ");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
