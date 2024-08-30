package baekjoon.bronze;

import java.io.*;

public class b_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                writer.write("*");
            }
            writer.write("\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
