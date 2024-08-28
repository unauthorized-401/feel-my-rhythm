package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2753 {
    public static void main(String[] args) throws IOException {
        // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(reader.readLine());

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
