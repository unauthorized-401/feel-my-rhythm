package baekjoon.bronze;

import java.io.*;

public class b_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();

        writer.write(input.length() + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
