package baekjoon.bronze;

import java.io.*;

public class b_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) { // 1 2 3 4 5
            for (int j = n-i; j > 0; j--) { // 4 3 2 1 0
                writer.write(" ");
            }
            for (int k = 1; k <= i; k++) { // 1 2 3 4 5
                writer.write("*");
            }
            writer.write("\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
