package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class b_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int[] matrix = new int[n*m];
        int length = 0;

        // 배열에 첫번째 행렬 초기화
        for (int i = 0; i < n; i++) { // n줄
            String[] nums = reader.readLine().split(" ");

            for (int j = 0; j < m; j++) { // m개
                matrix[length] = Integer.parseInt(nums[j]);
                length += 1;
            }
        }

        length = 0;

        // 배열에 두번째 행렬 덧셈
        for (int i = 0; i < n; i++) { // n줄
            String[] nums = reader.readLine().split(" ");

            for (int j = 0; j < m; j++) { // m개
                matrix[length] += Integer.parseInt(nums[j]);
                length += 1;
            }
        }

        length = 0;

        // 행렬 출력
        for (int i = 0; i < n; i++) { // n줄
            for (int j = 0; j < m; j++) { // m개
                if (j == (m-1)) {
                    writer.write(matrix[length] + "");
                } else {
                    writer.write(matrix[length] + " ");
                }
                length += 1;
            }
            writer.write("\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
