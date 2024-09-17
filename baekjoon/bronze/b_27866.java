package baekjoon.bronze;

import java.io.*;

public class b_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        writer.write(input.charAt(num-1) + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
