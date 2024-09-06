package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String stringNumbers = reader.readLine();
        int target = Integer.parseInt(reader.readLine());

        int[] array = new int[100];
        String[] numbers = stringNumbers.split(" ");

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            array[num - 1] += 1;
        }

        writer.write(array[target-1] + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }
}
