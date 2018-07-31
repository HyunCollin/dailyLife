package dailyLife.se;

import java.util.Scanner;

public class No5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum = sc.nextLine();
		int time = 0;
		
		for (int i = 0; i < sNum.length(); i++) {
			char ch = sNum.charAt(i);
			if(65 <= ch && ch <= 67 ) {
				time+=3;
			}else if( 68 <= ch && ch <= 70 ) {
				time+=4;
			}else if( 71 <= ch && ch <= 73 ) {
				time+=5;
			}else if( 74 <= ch && ch <= 76 ) {
				time+=6;
			}else if( 77 <= ch && ch <= 79 ) {
				time+=7;
			}else if( 80 <= ch && ch <= 83 ) {
				time+=8;
			}else if( 84 <= ch && ch <= 86 ) {
				time+=9;
			}else if( 87 <= ch && ch <= 90 ) {
				time+=10;
			}
		}
		
		System.out.println(time);
	}
}
