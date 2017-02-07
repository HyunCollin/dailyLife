package dailyLife.feb;

import java.util.Scanner;

public class IntPairSort {
	private static int n = 11;
	private static int y = 2;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] maps = new int[n][y];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < y; j++) {
				maps[i][j] = scanner.nextInt();
			}
		}
		sortOrderAsc(maps);
		printArrays(maps);
		scanner.close();
	}

	private static void printArrays(int[][] maps) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(maps[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private static void sortOrderAsc(int[][] maps) {
		for (int i = 0; i < n; i++) {
			int frInt = maps[i][1];
			int tIndex = 0;
			
			for (int j = i; j < n; j++) {
				int backInt = maps[j][1];
				if(frInt >= backInt){
					frInt = backInt;
					tIndex = j;
				}
			}
			if(tIndex > 0 ){
				int tempA = maps[i][0];
				int tempB = maps[i][1];
				maps[i][0] = maps[tIndex][0];
				maps[i][1] = maps[tIndex][1];
				maps[tIndex][0] = tempA;
				maps[tIndex][1] = tempB;
			}
		}		
	}
}