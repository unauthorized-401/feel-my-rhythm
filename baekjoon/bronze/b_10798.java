package baekjoon.bronze;

import java.io.*;

public class b_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] matrix = new String[15 * 5];
        int length = 0;

        for (int i = 0; i < 5; i++) { // 5줄
            String[] letters = reader.readLine().split("");

            for (int j = 0; j < letters.length; j++) {
                matrix[length] = letters[j];
                length += 1;
            }
            length += (15 - letters.length); // 남은 수 만큼 배열 방 넘기기
        }

        // 0, 15, 30, 45, 60, 1, 16, 31, ..., 14, 29, 44
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 75; j+=15) {
                if (matrix[i+j] != null) {
                    writer.write(matrix[i+j] + "");
                }
            }
        }
        writer.write("\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
