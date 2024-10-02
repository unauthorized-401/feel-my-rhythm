package baekjoon.bronze;

import java.io.*;

public class b_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int row = 0, column = 0;

        for (int i = 0; i < 9; i++) {
            String[] nums = reader.readLine().split(" ");

            for (int j = 0; j < 9; j++) {
                int target = Integer.parseInt(nums[j]);

                if (target > max) {
                    max = target;
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        writer.write(max + "\n");
        writer.write(row + " " + column + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
