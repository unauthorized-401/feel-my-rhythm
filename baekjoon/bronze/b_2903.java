package baekjoon.bronze;

import java.io.*;

public class b_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] values = new int[15];

        int index = 2;
        for (int i = 0; i < n; i++) {
            index = index * 2 - 1;
            values[i] = index * index;
        }

        writer.write(values[n-1] + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
