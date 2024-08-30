package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int gugudan = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.println(gugudan + " * " + i + " = " + gugudan * i);
        }
    }
}
