package baekjoon.bronze;

import java.io.*;

public class b_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];

        for (int i = 0; i <= 27; i++) {
            int student = Integer.parseInt(reader.readLine());
            students[student-1] = 1;
        }

        for (int j = 0; j < 30; j++) {
            if (students[j] == 0) {
                writer.write((j + 1) + "\n");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
