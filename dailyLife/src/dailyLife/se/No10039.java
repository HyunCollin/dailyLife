package dailyLife.se;

import java.util.Scanner;

public class No10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 5;
		int tot = 0;
		for (int i = 0; i < cnt; i++) {
			int temp = sc.nextInt(); 
			if(temp < 40) {
				tot += 40;
			}else {
				tot += temp;
			}
		}
		System.out.println(tot / 5);
	}
}
