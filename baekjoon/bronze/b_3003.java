package baekjoon.bronze;

import java.io.*;

public class b_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");

        int[] wanted = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int target = Integer.parseInt(input[i]);

            if (i == 5) {
                writer.write((wanted[i] - target) + "\n");
            } else {
                writer.write((wanted[i] - target) + " ");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
