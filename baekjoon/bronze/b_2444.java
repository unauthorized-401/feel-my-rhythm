package baekjoon.bronze;

import java.io.*;

public class b_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(reader.readLine());

        for (int i = 0; i < line; i++) { // 0, 1, 2, 3, 4
            for (int j = (line-i-1); j > 0; j--) { // 4, 3, 2, 1, 0
                writer.write(" ");
            }
            for (int k = 0; k < (i*2+1); k++) { // 1, 3, 5, 7, 9
                writer.write("*");
            }
            writer.write("\n");
        }

        for (int l = 0; l < (line-1); l++) { // 0, 1, 2, 3
            for (int m = 0; m < (l+1); m++) { // 1, 2, 3, 4
                writer.write(" ");
            }
            for (int n = ((line-l-1)*2-1); n > 0; n--) { // 7, 5, 3, 1
                writer.write("*");
            }
            writer.write("\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
