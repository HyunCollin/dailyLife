package dailyLife.jan;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2231
public class DigitGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean nFind = true;
        // int n = 216;

        for (Integer i = 1; i <= n; i++) {
            int sum = i;
            int divNumber = i;

            while (true) {
                if (divNumber > 10) {
                    int tempNumber = divNumber / 10;
                    sum += divNumber - tempNumber * 10;
                    divNumber = tempNumber;

                } else {
                    sum += divNumber % 10;
                    break;
                }
            }

            if (sum == n) {
                System.out.println(i);
                nFind = false;
                break;
            }
        }
        if (nFind) {
            System.out.println(0);
        }
    }
}