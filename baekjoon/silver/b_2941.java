package baekjoon.silver;

import java.io.*;
import java.util.Objects;

public class b_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputs = reader.readLine();
        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        while (true) {
            boolean flag = false;

            for (String alphabet : alphabets) {
                if ((inputs.length() >= 2 && Objects.equals(inputs.substring(0, 2), alphabet))
                        || (inputs.length() >= 3 && Objects.equals(inputs.substring(0, 3), alphabet))) {
                    inputs = inputs.substring(alphabet.length());
                    count += 1;

                    flag = true;
                    break;
                }
            }

            if (!flag) { // 일치하는 알파벳이 없을 때
                if (inputs.isEmpty()) { // 남은 알파벳이 없을 때
                    break;
                }

                if (inputs.length() == 1) { // 남은 알파벳이 하나일 때
                    count += 1;
                    break;
                }

                inputs = inputs.substring(1);
                count += 1;
            }
        }

        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
