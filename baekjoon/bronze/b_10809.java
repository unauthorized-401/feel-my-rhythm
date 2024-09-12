package baekjoon.bronze;

import java.io.*;
import java.util.Objects;

public class b_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        String[] slices = input.split("");

        for (char i = 'a'; i <= 'z'; i ++) {
            boolean flag = false;
            for (int j = 0; j < slices.length; j++) {
                if (Objects.equals(slices[j], String.valueOf(i))) {
                    if (i == 'z') {
                        writer.write( j + "\n");
                        flag = true;
                        break;
                    } else {
                        writer.write( j + " ");
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                if (i == 'z') {
                    writer.write( (-1) + "\n");
                } else {
                    writer.write( (-1) + " ");
                }
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
