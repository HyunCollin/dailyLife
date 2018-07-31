package dailyLife.se;

import java.util.Scanner;

public class No2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int index = 0;
		int count = 0;
		
		while(true) {
			if(check1(input, index)) {
				index += 3;
				count ++ ;
			}else if(check2(input, index)) {
				index += 2;
				count ++ ;
			}else {
				index ++;
				count ++;
			}
			if(index >= input.length()) {
				break;
			}
		}
		System.out.println(count);
	}

	private static boolean check2(String string, int index) {
		int end = Math.min(index+2, string.length());
		String se = string.substring(index, end);
		if("c=".equals(se) || "c-".equals(se) || "d-".equals(se) || "lj".equals(se) || "nj".equals(se)
				|| "s=".equals(se) || "z=".equals(se) ) {
//			System.out.println(se);
			return true;
		}
		return false;
	}

	private static boolean check1(String string, int index) {
		int end = Math.min(index+3, string.length());
		String se = string.substring(index, end);
		if("dz=".equals(se)) {
//			System.out.println(se);
			return true;
		}else {
			return false;
		}
	}
}
