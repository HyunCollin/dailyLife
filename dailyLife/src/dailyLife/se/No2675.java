package dailyLife.se;
//2
//3 ABC
//5 /HTP
//AAABBBCCC
///////HHHHHTTTTTPPPPP
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			list.add(sc.nextLine());
		}
		
		for (String str : list) {
			StringBuilder sb = new StringBuilder();
			String[] arr = str.split(" ");
			int re = Integer.parseInt(arr[0]);
			for (int i = 0; i < arr[1].length(); i++) {
				char[] ch = arr[1].toCharArray();
				for (int j = 0; j < re; j++) {
					sb.append(ch[i]);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
