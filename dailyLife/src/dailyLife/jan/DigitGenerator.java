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
            String temp = i.toString();
            char[] temps = temp.toCharArray();

            for (int j = 0; j < temps.length; j++) {
                sum += Integer.parseInt(String.valueOf(temps[j]));
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