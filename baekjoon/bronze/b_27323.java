package baekjoon.bronze;

import java.io.*;

public class b_27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        writer.write(a * b + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
