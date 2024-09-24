package baekjoon.bronze;

import java.io.*;

public class b_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            int value = Integer.parseInt(reader.readLine());

            int q = 0;
            while (value >= 25) {
                int quotient = value / 25;
                int remainder = value % 25;

                value = remainder;
                q = quotient;
            }

            int d = 0;
            while (value >= 10) {
                int quotient = value / 10;
                int remainder = value % 10;

                value = remainder;
                d = quotient;
            }

            int n = 0;
            while (value >= 5) {
                int quotient = value / 5;
                int remainder = value % 5;

                value = remainder;
                n = quotient;
            }

            int p = 0;
            while (value >= 1) {
                int quotient = value / 1;
                int remainder = value % 1;

                value = remainder;
                p = quotient;
            }

            writer.write(q + " " + d + " " + n + " " + p + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
