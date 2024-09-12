package baekjoon.bronze;

import java.io.*;

public class b_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        String input = reader.readLine();

        String[] slicesByOne = input.split("");

        int sum = 0;
        for (String slice : slicesByOne) {
            sum += Integer.parseInt(slice);
        }

        writer.write(sum + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
