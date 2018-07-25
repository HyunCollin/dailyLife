package dailyLife.se;

import java.util.Scanner;

public class No10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 97; i < 123; i++) {
			int index = input.indexOf(String.valueOf((char)i));
			if(i == 122) {
				sb.append(index);
			}else {
				sb.append(index + " ");
			}
		}
		System.out.println(sb.toString());
	}
}
