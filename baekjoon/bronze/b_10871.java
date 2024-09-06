package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //10 5
        //1 10 4 9 2 3 8 5 7 6
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
        int n = Integer.parseInt(token.nextToken());
        int x = Integer.parseInt(token.nextToken());

        String stringNumbers = reader.readLine();
        String[] numbers = stringNumbers.split(" ");
        List<Integer> results = new ArrayList<Integer>();

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < x) {
                results.add(num);
            }
        }

        for (int i = 0; i < results.size(); i++) {
            if (i == (results.size()-1)) {
                writer.write(results.get(i) + "\n");
            } else {
                writer.write(results.get(i) + " ");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
