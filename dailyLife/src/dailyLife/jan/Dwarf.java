package dailyLife.jan;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    // https://www.acmicpc.net/problem/2309
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] dwarf = { 20, 7, 23, 19, 10, 15, 25, 8, 13 };
        int[] dwarf = new int[9];
        int[] nDwarf = new int[2];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            dwarf[i] = scanner.nextInt();
            total += dwarf[i];
        }
        Arrays.sort(dwarf);

        int diff = total - 100;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (diff == (dwarf[i] + dwarf[j])) {
                    nDwarf[0] = i;
                    nDwarf[1] = j;
                    break;
                }
            }
            if (nDwarf[0] > 0) {
                break;
            }
        }

        for (int i = 0; i < dwarf.length; i++) {
            if (i != nDwarf[0] && i != nDwarf[1]) {
                System.out.println(dwarf[i]);
            }
        }
    }
}
