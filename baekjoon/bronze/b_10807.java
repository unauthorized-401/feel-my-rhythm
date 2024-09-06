package baekjoon.bronze;

import java.io.*;

public class b_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String stringNumbers = reader.readLine();
        int target = Integer.parseInt(reader.readLine());

        // index: 0 1 2 3 ... 100 101 102 ... 199 200
        // value: -100 -99 -98 -97 ... 0 1 2 ... 99 100
        int[] array = new int[201];

        String[] numbers = stringNumbers.split(" ");
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            array[num + 100] += 1;
        }

        writer.write(array[target+100] + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
