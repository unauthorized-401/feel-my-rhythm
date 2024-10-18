package baekjoon.bronze;

import java.io.*;

public class b_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        if (n == 1) {
            writer.write(1 + "\n");

        } else {
            int index = 2;
            int start = 2;
            int end = 0;

            while (true) {
                int plus = index * 6 - 7;
                end = start + plus;

                if (start <= n && n <= end) {
                    writer.write(index + "\n");
                    break;
                }

                index += 1;
                start = end + 1;
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
