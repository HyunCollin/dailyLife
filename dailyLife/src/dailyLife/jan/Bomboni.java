package dailyLife.jan;

import java.util.Scanner;
//https://www.acmicpc.net/problem/3085
public class Bomboni {

    private static int n;
    private static char[][] maps;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sN = scanner.nextLine();
        n = Integer.parseInt(sN);
        maps = new char[n][n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            char[] inchars = input.toCharArray();
            for (int j = 0; j < n; j++) {
                maps[i][j] = inchars[j];
            }
        }

        int eatCandy = 0;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                char temp = '.';
                if (y + 1 < n) {
                    temp = maps[x][y + 1];
                    maps[x][y + 1] = maps[x][y];
                    maps[x][y] = temp;
                    eatCandy = Math.max(eatCandy, getCandyCntToEat());
                    temp = maps[x][y + 1];
                    maps[x][y + 1] = maps[x][y];
                    maps[x][y] = temp;
                }

                if (x + 1 < n) {
                    temp = maps[x + 1][y];
                    maps[x + 1][y] = maps[x][y];
                    maps[x][y] = temp;
                    eatCandy = Math.max(eatCandy, getCandyCntToEat());
                    temp = maps[x + 1][y];
                    maps[x + 1][y] = maps[x][y];
                    maps[x][y] = temp;
                }

            }
        }
        System.out.println(eatCandy);
        scanner.close();
    }

    private static int getCandyCntToEat() {

        int candyCnt = 0;

        for (int x = 0; x < n; x++) {
            int tempCandyCnt = 1;

            for (int y = 0; y < n - 1; y++) {
                if (maps[x][y] == maps[x][y + 1]) {
                    tempCandyCnt++;
                } else {
                    candyCnt = Math.max(tempCandyCnt, candyCnt);
                    tempCandyCnt = 1;
                }
            }
            if (tempCandyCnt > candyCnt) {
                candyCnt = tempCandyCnt;
            }
        }

        for (int y = 0; y < n; y++) {
            int tempCandyCnt = 1;

            for (int x = 0; x < n - 1; x++) {

                if (maps[x][y] == maps[x + 1][y]) {
                    tempCandyCnt++;
                } else {
                    candyCnt = Math.max(tempCandyCnt, candyCnt);
                    tempCandyCnt = 1;
                }
            }
            if (tempCandyCnt > candyCnt) {
                candyCnt = tempCandyCnt;
            }
        }

        return candyCnt;
    }

}
