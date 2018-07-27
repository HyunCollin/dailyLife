package dailyLife.se;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class No1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer count = Integer.parseInt(sc.nextLine());
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			list.add(sc.nextLine());
		}
		
		int ans = 0;
		for (String text : list) {
			ans += check(text);
		}
		System.out.println(ans);
	}

	private static int check(String string) {
		int result = 1;
		
		if(string.length() <= 1) {
			return result;
		}
		HashMap<Character, Boolean> map = new HashMap<>();
		
		char[] arr = string.toCharArray();
		char before = arr[0];
		for (int i = 0; i < arr.length; i++) {
			char now = arr[i];
			//문자 나온적 있음
			if(map.containsKey(now)) {
				if(before == now) {
					continue;
				}else {
					result = 0;
					break;
				}
			}else {
				// 문자 나온적 없음
				map.put(now, true);
				before = now;
			}
			
		}
		
		return result;
	}

}
