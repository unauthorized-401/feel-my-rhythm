package baekjoon.bronze;

import java.io.*;

public class b_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < num; i++) {
            String input = reader.readLine();

            writer.write(input.charAt(0) + "" + input.charAt(input.length()-1) + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
