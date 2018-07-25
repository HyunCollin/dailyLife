package dailyLife.se;
//5
//OOXXOXXOOO        10
//OOXXOOXXOO        9
//OXOXOXOXOXOXOX    7
//OOOOOOOOOO        55
//OOOOXOOOOXOOOOX	30	
//int roop = 5;
//arr[0] = "OOXXOXXOOO";
//arr[1] = "OOXXOOXXOO";
//arr[2] = "OXOXOXOXOXOXOX";
//arr[3] = "OOOOOOOOOO";
//arr[4] = "OOOOXOOOOXOOOOX";

import java.io.IOException;
import java.util.Scanner;


public class No8958 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int roop = Integer.parseInt(sc.nextLine());
		String[] arr = new String[roop];
		for (int i = 0; i < roop; i++) {
			arr[i] = sc.nextLine();
		}
		cal(arr);
	}

	private static void cal(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			char[] cArr = arr[i].toCharArray();
			int ans = 0;
			int point = 0;
			for (int j = 0; j < cArr.length; j++) {
				if("O".equals(String.valueOf(cArr[j]).toUpperCase())) {
					point++;
					ans = ans + point;
				}else {
					point = 0;
				}
			}
			System.out.println(ans);
		}
	}
}
